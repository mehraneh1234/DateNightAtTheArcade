// Mehraneh - 30062786
// AT1 - Portfolio / Activity 3
class Card {
    // immutable property of type Int
    val cardNumber: Int
    // mutable properties of type Int
    var creditBalance: Int = 0
    var ticketBalance: Int = 0
    // Define a singleton instance that belongs to the class itself, not to instance of the class.
    // everytime a new instance of the class is created, the cardCounter property is incremented,
    // Giving each card a unique identification number.
    companion object{
        private var cardCounter = 0
    }
    // To initialize properties when an instance of the class is created.
    init{
        cardCounter++               // Increments the cardCounter value
        cardNumber = cardCounter    // Assign the value of cardCounter to the cardNumber
    }
}