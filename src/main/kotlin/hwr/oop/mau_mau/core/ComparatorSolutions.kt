package hwr.oop.mau_mau.core

class ColorComparator : Comparator<Card> {
  
  override fun compare(
    o1: Card,
    o2: Card,
  ): Int {
    // use ordering provided by Color enum
    return o1.color.order.compareTo(o2.color.order)
  }
  
}

class ValueComparator : Comparator<Card> {
  
  override fun compare(
    o1: Card,
    o2: Card,
  ): Int {
    // other option: assign ordering values in the Comparator's context
    return cardOrder(o1).compareTo(cardOrder(o2))
  }
  
  private fun cardOrder(card: Card): Int {
    return when (card.value) {
      Value.SEVEN -> 0
      Value.EIGHT -> 1
      Value.NINE -> 2
      Value.TEN -> 3
      Value.JACK -> 4
      Value.QUEEN -> 5
      Value.KING -> 6
      Value.ACE -> 7
    }
  }
  
}

class CombinedComparator(
  private val byColor: Comparator<Card> = ColorComparator(),
  private val byValue: Comparator<Card> = ValueComparator(),
) : Comparator<Card> {
  
  override fun compare(
    o1: Card,
    o2: Card,
  ): Int {
    val byValue = byValue.compare(o1, o2)
    val byColor = byColor.compare(o1, o2)
    return if (byValue != 0) byValue else byColor
  }
}
