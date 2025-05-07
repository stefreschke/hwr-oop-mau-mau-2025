package hwr.oop.mau_mau.tests.core

import hwr.oop.mau_mau.core.*
import io.kotest.core.spec.style.AnnotationSpec
import org.assertj.core.api.Assertions.assertThat

class Task02_CardComparabilityTest : AnnotationSpec() {
  
  @Test
  fun `value comparator, 8 of Spades greater than 7 of Spades`() {
    // given
    val first = Card(Value.SEVEN, Color.SPADE)
    val second = Card(Value.EIGHT, Color.SPADE)
    // when
    val sut: Comparator<Card> = ValueComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `value comparator, Ace of Spades greater than King of Spades`() {
    // given
    val first = Card(Value.KING, Color.SPADE)
    val second = Card(Value.ACE, Color.SPADE)
    // when
    val sut: Comparator<Card> = ValueComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `value comparator, Ace of Spades greater than 7 of Spades`() {
    // given
    val first = Card(Value.SEVEN, Color.SPADE)
    val second = Card(Value.ACE, Color.SPADE)
    // when
    val sut: Comparator<Card> = ValueComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `color comparator, 7 of Hearts greater than 7 of Diamonds`() {
    // given
    val first = Card(Value.SEVEN, Color.DIAMOND)
    val second = Card(Value.SEVEN, Color.HEART)
    // when
    val sut: Comparator<Card> = ColorComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `color comparator, 7 of Clubs greater than 7 of Spades`() {
    // given
    val first = Card(Value.SEVEN, Color.SPADE)
    val second = Card(Value.SEVEN, Color.CLUB)
    // when
    val sut: Comparator<Card> = ColorComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `color comparator, 7 of Clubs greater than 7 of Diamonds`() {
    // given
    val first = Card(Value.SEVEN, Color.DIAMOND)
    val second = Card(Value.SEVEN, Color.CLUB)
    // when
    val sut: Comparator<Card> = ColorComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `combined comparator, 10 of Spades greater than 10 of Hearts`() {
    // given
    val first = Card(Value.TEN, Color.SPADE)
    val second = Card(Value.TEN, Color.CLUB)
    // when
    val sut: Comparator<Card> = CombinedComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `combined comparator, 10 of Hearts greater than 10 of Diamonds`() {
    // given
    val first = Card(Value.TEN, Color.DIAMOND)
    val second = Card(Value.TEN, Color.HEART)
    // when
    val sut: Comparator<Card> = CombinedComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `combined comparator, Jack of Hearts greater than 10 of Hearts`() {
    // given
    val first = Card(Value.TEN, Color.HEART)
    val second = Card(Value.JACK, Color.HEART)
    // when
    val sut: Comparator<Card> = CombinedComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `combined comparator, Jack of Hearts greater than 10 of Spades`() {
    // given
    val first = Card(Value.TEN, Color.SPADE)
    val second = Card(Value.JACK, Color.HEART)
    // when
    val sut: Comparator<Card> = CombinedComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
  @Test
  fun `combined comparator, Jack of Hearts greater than 10 of Diamonds`() {
    // given
    val first = Card(Value.TEN, Color.DIAMOND)
    val second = Card(Value.JACK, Color.HEART)
    // when
    val sut: Comparator<Card> = CombinedComparator()
    val firstSecond = sut.compare(first, second)
    val secondFirst = sut.compare(second, first)
    // then
    assertThat(firstSecond).isNegative.isNotZero
    assertThat(secondFirst).isPositive.isNotZero
  }
  
}
