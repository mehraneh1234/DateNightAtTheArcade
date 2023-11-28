// Mehraneh - 30062786
// AT1 - Portfolio / Activity 3
// Define an interface with some functions
interface TerminalInterface {
    // Function with two parameters to add credits to a card.
    fun addCredits(card: Card, money: Int)
    // Function with two parameters to transfer credits from one card to another.
    fun transferCredits(fromCard: Card, toCard: Card)
    // Function with two parameters to transfer tickets from one card to another.
    fun transferTickets(fromCard: Card, toCard: Card)
    // Function with two parameters to request a prize
    fun requestPrize(prizeName: String, card: Card)
    // Function with one parameter to check the balances associated with a card.
    fun checkBalances(card: Card)
}