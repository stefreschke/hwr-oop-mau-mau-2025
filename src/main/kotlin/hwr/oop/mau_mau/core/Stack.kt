package hwr.oop.mau_mau.core

/**
 * Stacks are mutable!
 */
class Stack(
  // cards: MutableList<Card>,
) {
  val cards: MutableList<Card> = buildCards();
  
  private fun buildCards(): MutableList<Card> {
    val cards = mutableListOf<Card>()
    for (color in Color.entries) {
      for (value in Value.entries) {
        cards.add(Card(value, color))
      }
    }
    cards.shuffle()
    return cards
  }
  
  fun take(numberOfCards: Int): List<Card> {
    return cards.take(numberOfCards)
  }
}
