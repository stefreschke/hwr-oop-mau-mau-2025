package hwr.oop.mau_mau.tests.core

import hwr.oop.mau_mau.core.Card
import hwr.oop.mau_mau.core.Color
import hwr.oop.mau_mau.core.Value
import io.kotest.core.spec.style.AnnotationSpec
import org.assertj.core.api.Assertions.assertThat

class Task01_CardEqualityTest : AnnotationSpec() {
  
  @Test
  fun `2 cards, same color, same value, equal`() {
    // given
    val first = Card(Value.SEVEN, Color.DIAMOND)
    val second = Card(Value.SEVEN, Color.DIAMOND)
    // then
    assertThat(first).isEqualTo(second)
  }
  
  @Test
  fun `2 cards, same color, same value, not identical`() {
    // given
    val first = Card(Value.SEVEN, Color.DIAMOND)
    val second = Card(Value.SEVEN, Color.DIAMOND)
    // then
    assertThat(first).isNotSameAs(second)
  }
  
  @Test
  fun `2 cards, same color, different value, not equal`() {
    // given
    val first = Card(Value.SEVEN, Color.DIAMOND)
    val second = Card(Value.EIGHT, Color.DIAMOND)
    // then
    assertThat(first).isNotEqualTo(second)
  }
  
  @Test
  fun `2 cards, different color, same value, not equal`() {
    // given
    val first = Card(Value.SEVEN, Color.DIAMOND)
    val second = Card(Value.SEVEN, Color.SPADE)
    // then
    assertThat(first).isNotEqualTo(second)
  }
  
  @Test
  fun `2 cards, different color and value, not equal`() {
    // given
    val first = Card(Value.EIGHT, Color.DIAMOND)
    val second = Card(Value.SEVEN, Color.SPADE)
    // then
    assertThat(first).isNotEqualTo(second)
  }
}