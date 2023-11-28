// Mehraneh - 30062786
// AT1 - Portfolio / Activity 3
// Define a class that implements the methods declared in the "TerminalInterface" interface
class Terminal : TerminalInterface {
    // Define a private mutable list
    private var prizeCategories = mutableListOf(
        // Create instances of the PrizeCategory class and passing some values to its constructor.
        PrizeCategory("Candy", 5, 10),
        PrizeCategory("Hat", 15, 5),
        PrizeCategory("Glasses", 20, 3)
    )
    // Implementation for a function that is declared in the interface with 2 parameters for adding
    // money as a credit to the cards
    override fun addCredits(card: Card, money: Int){
        card.creditBalance += money * 2
        println("Added ${money * 2} credits to Card #${card.cardNumber}.")
        println("New credit balance: ${card.creditBalance}")
    }
    // Implementation for a function that is declared in the interface with 2 parameters for
    // transferring the credits from one card to the other card.
    override fun transferCredits(fromCard: Card, toCard: Card){
        toCard.creditBalance += fromCard.creditBalance
        fromCard.creditBalance = 0
        println("Transferred credits from Card #${fromCard.cardNumber} to Card #${toCard.cardNumber}.")
    }
    // Implementation for a function that is declared in the interface with 2 parameters for
    // transferring ticket balance from one card to another card.
    override fun transferTickets(fromCard: Card, toCard: Card){
        toCard.ticketBalance += fromCard.ticketBalance
        fromCard.ticketBalance = 0
        println("Transferred tickets from Card #${fromCard.cardNumber} to Card #${toCard.cardNumber}.")
    }
    // Implementation for a function that is declared in the interface with 2 parameters for
    // buying prizes by credits or tickets.
    override fun requestPrize(prizeName: String, card: Card){
        // Using the find function on a list to search for a prize with a specific name "prizeName"
        // refers to the "name" property of each element in the list.
        val prize = prizeCategories.find {it.name == prizeName}
        if (prize != null){
            if (card.ticketBalance >= prize.ticketRequired && prize.itemCount > 0){
                card.ticketBalance -= prize.ticketRequired
                prize.itemCount--       // Decrease 0ne item from the prize count
                println("Card #${card.cardNumber} claimed a $prizeName!")
                println("New ticket balance: ${card.ticketBalance}, remaining $prizeName items: ${prize.itemCount}")
            }
            else{ // Display the following message if ticketBalance < ticketRequired and itemCount <= 0.
                println("Card #${card.cardNumber} cannot claim $prizeName due to insufficient tickets or availability.")
            }
        }
        else{ // Display "Invalid prize name: $prizeName" if prize == null
            println("Invalid prize name: $prizeName")
        }

    }
    // Implementation for a function that is declared in the interface with 2 parameters for
    // displaying the card number, credit balance and ticket balance.
    override fun checkBalances(card: Card){
        println("Card #${card.cardNumber} - Credit balance: ${card.creditBalance}, " +
                "ticket balance: ${card.ticketBalance}")
    }
}