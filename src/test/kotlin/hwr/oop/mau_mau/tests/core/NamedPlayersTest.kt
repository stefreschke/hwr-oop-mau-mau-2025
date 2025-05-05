package hwr.oop.mau_mau.tests.core

import hwr.oop.mau_mau.core.Player
import io.kotest.core.spec.style.AnnotationSpec
import org.assertj.core.api.Assertions.assertThat

class NamedPlayersTest : AnnotationSpec() {
  
  @Test
  fun `player Alice is named Alice`() {
    // given
    val alice = Player(name = "Alice")
    // when
    val name = alice.name
    // then
    assertThat(name).isEqualTo("Alice")
  }
  
  @Test
  fun `player Bob is named Bob`() {
    // given
    val bob = Player(name = "Bob")
    // when
    val name = bob.name
    // then
    assertThat(name).isEqualTo("Bob")
  }
  
  @Test
  fun `player Charlie is named Charlie`() {
    // given
    val charlie = Player(name = "Charlie")
    // when
    val name = charlie.name
    // then
    assertThat(name).isEqualTo("Charlie")
  }
  
}