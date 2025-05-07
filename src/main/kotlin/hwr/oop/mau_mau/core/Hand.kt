package hwr.oop.mau_mau.core

/**
 * Hands are mutable!
 */
class Hand(
  val cards: MutableList<Card> = mutableListOf(),
) : Iterable<Card> by cards {
  
  fun add(addedCards: List<Card>) {
    cards.addAll(addedCards)
  }
  
  fun size(): Int = cards.size
  
}

