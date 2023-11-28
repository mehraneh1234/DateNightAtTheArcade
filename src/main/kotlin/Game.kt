// Mehraneh - 30062786
// AT1 - Portfolio / Activity 3
// import Random class from kotlin.random package
import kotlin.random.Random
// Define a class with a primary constructor with a parameter that implements the method in the "Playable" interface
class Game( private val creditsRequired: Int) : Playable {
    // Implementation for a function that is declared in the interface
    override fun play(card: Card) {
        if (card.creditBalance >= creditsRequired) {
            card.creditBalance -= creditsRequired
            // Generate a random integer value between 0 and 9 using nextInt function provided by
            // the Random class from Kotlin standard library.
            val ticketsWon = Random.nextInt(10)
            card.ticketBalance += ticketsWon
            // Display "Card #${card.cardNumber} played the game, won $ticketsWon tickets."
            // Display "New credit balance: ${card.creditBalance}, new ticket balance: ${card.ticketBalance}"
            println("Card #${card.cardNumber} played the game, won $ticketsWon tickets.")
            println("New credit balance: ${card.creditBalance}, new ticket balance: ${card.ticketBalance}")

        }
        // If creditBalance is less than creditRequired then display this message
        // "Card #${card.cardNumber} does not have enough credits to play the game."
        else{
            println("Card #${card.cardNumber} does not have enough credits to play the game.")
        }
    }

}