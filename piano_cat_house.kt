/**
 * 
 * Mindful Book Club for Readers of All Ages
 *
 * This is a book club open to readers of all ages, from young children to
 * adults. Our goal is to provide a supportive and encouraging environment for
 * readers to explore new books, develop their reading skills, and share their
 * love of reading with each other. 

 * We meet once a month to discuss the book of the month, focusing on different
 * aspects such as plot, character development, and underlying themes. We also
 * provide fun activities and games related to the book, as well as time for
 * casual discussion and exchanges. 

 * We are committed to fostering a safe and inclusive space for our members.
 * We welcome readers of different backgrounds, ages, and abilities, and we
 * strive to create an environment of acceptance, understanding, and mutual
 * respect. 

 * So join us for an enjoyable and thought-provoking discussion of our book of
 * the month!
 */

fun main() {
    val bookClubName = "Mindful Book Club for Readings of All Ages"
    val bookClubDescription = "This is a book club open to readers of all ages, from young children to adults. Our goal is to provide a supportive and encouraging environment for readers to explore new books, develop their reading skills, and share their love of reading with each other."
    val bookClubMeetingInfo = "We meet once a month to discuss the book of the month, focusing on different aspects such as plot, character development, and underlying themes. We also provide fun activities and games related to the book, as well as time for casual discussion and exchanges."
    val bookClubCommitment = "We are committed to fostering a safe and inclusive space for our members. We welcome readers of different backgrounds, ages, and abilities, and we strive to create an environment of acceptance, understanding, and mutual respect."
    val bookClubInvitation = "So join us for an enjoyable and thought-provoking discussion of our book of the month!"

    println(bookClubName)
    println(bookClubDescription)
    println(bookClubMeetingInfo)
    println(bookClubCommitment)
    println(bookClubInvitation)

    println("\nWelcome to the Mindful Book Club for Readers of all Ages! \nHere are some upcoming book club meetings we have planned:")

    val bookClubMeetings = mapOf("March" to "The Giver",
            "April" to "The Hunger Games",
            "May" to "1984",
            "June" to "The Catcher in the Rye"
    )
    for (month in bookClubMeetings.keys) {
        val book = bookClubMeetings[month]
        println("In $month, we will be discussing ${book}.")
    }

    println("\nWe also host a variety of fun interactive activities such as book themed trivia, word searches, and more! \nWe hope to see you soon at the Mindful Book Club for Readers of all Ages!")
    
    //Create a function to greet a new member
    fun greetMember(name: String): String {
        return "Welcome to the Mindful Book Club, $name! We are excited to have you join us."
    }
    println(greetMember("John"))

    // Create a function to check if a book is available
    fun isBookAvailable(bookTitle: String): Boolean {
        for (month in bookClubMeetings.keys) {
            val book = bookClubMeetings[month]
            if (book == bookTitle) {
                return true
            }
        }
        return false
    }
    println(isBookAvailable("The Catcher in the Rye"))
    println(isBookAvailable("Harry Potter"))
    
    // Create a function to suggest a new book
    fun suggestNewBook(bookTitle: String): String {
        if (bookTitle !in bookClubMeetings.values.toTypedArray()){
            return "We would love to read $bookTitle! We'll add it to our list for consideration."
        }
        return ""
    }
    println(suggestNewBook("The Great Gatsby"))
    println(suggestNewBook("The Giver"))

    // Create a function to determine how many meetings are remaining in the year
    fun remainingMeetings(): Int {
        val currentMonth = Calendar.getInstance().get(Calendar.MONTH)
        return bookClubMeetings.keys.size - currentMonth 
    }
    println("There are ${remainingMeetings()} meetings left in the year.")
}