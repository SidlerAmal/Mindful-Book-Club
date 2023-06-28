// Book.ts

import {BookCollectionInterface} from './BookCollection';

export class Book {
  constructor (public title: string, public author: string, public description: string, public price: number) {}
  
  // Get information about the book
  getInfo (): string {
    return `${this.title} by ${this.author}. ${this.description} Price: $${this.price}`;
  }
}

// BookCollection.ts

// Create a type definition so we can add Interfaces to our project
export type BookCollectionInterface = {
  addBook(book: Book): void;
  getBook(title: string): Book | undefined;
  getTotalInventory(): number;
  removeBook(title: string): void;
};

export class BookCollection implements BookCollectionInterface {
  // Create a type alias for the bookCollection to be an array
  bookCollection: Book[] = [];

  // Add a book to the bookCollection
  addBook(book: Book): void {
    this.bookCollection.push(book);
  }

  // Get a book from the bookCollection
  getBook(title: string): Book | undefined {
    return this.bookCollection.find((book: Book) => book.title === title);
  }

  // Get the total count of books
  getTotalInventory(): number {
    return this.bookCollection.length;
  }

  // Remove a book from the bookCollection
  removeBook(title: string): void {
    const index = this.bookCollection.findIndex((book: Book) => book.title === title);
    if (index > -1) {
      this.bookCollection.splice(index, 1);
    }
  }
}

// MindfulBookClub.ts

import {Book, BookCollection} from './Book';

export class MindfulBookClub {
  private bookCollection: BookCollection;
  
  constructor () {
    this.bookCollection = new BookCollection();
  }

  // Add book to book collection
  addBook(book: Book): void {
    this.bookCollection.addBook(book);
  }

  // Get book from book collection
  getBook(title: string): Book | undefined {
    return this.bookCollection.getBook(title);
  }

  // Get total book count in book collection
  getTotalInventory(): number {
    return this.bookCollection.getTotalInventory();
  }

  // Remove book from book collection
  removeBook(title: string): void {
    this.bookCollection.removeBook(title);
  }

  // Get book recommendations
  getBookRecommendations (topic: string): Book[] {
    return this.bookCollection.bookCollection.filter((book: Book) => book.description.includes(topic));
  }
}