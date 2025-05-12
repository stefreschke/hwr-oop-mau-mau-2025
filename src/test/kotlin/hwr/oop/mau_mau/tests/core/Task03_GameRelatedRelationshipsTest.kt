package hwr.oop.mau_mau.tests.core

import hwr.oop.mau_mau.core.Game
import hwr.oop.mau_mau.core.Player
import hwr.oop.mau_mau.core.Stack
import io.kotest.core.spec.style.AnnotationSpec
import org.assertj.core.api.Assertions.assertThat

class Task03_GameRelatedRelationshipsTest : AnnotationSpec() {
  
  @Test
  fun `games have players`() {
    val players = listOf(Player("Alice"), Player("Bob"))
    val game = Game(players)
    val retrievedPlayers = game.players()
    assertThat(retrievedPlayers).isEqualTo(players)
  }
  
  @Test
  fun `games have a player who has to play next`() {
    // given
    val alice = Player("Alice")
    val players = listOf(alice, Player("Bob"))
    val game = Game(players)
    // when
    val nextPlayer = game.turn()
    // then
    assertThat(nextPlayer).isEqualTo(alice)
  }
  
  @Test
  fun `games have hands for players, initially all hands contain 7 cards`() {
    // given
    val alice = Player("Alice")
    val bob = Player("Bob")
    val players = listOf(alice, bob)
    val game = Game(players)
    // when
    val handOfAlice = game.handOf(alice)
    val handOfBob = game.handOf(bob)
    // then
    assertThat(handOfAlice.size()).isEqualTo(7)
    assertThat(handOfBob.size()).isEqualTo(7)
  }
  
  @Test
  fun `alice draws, has 8 cards in hand`() {
    // given
    val alice = Player("Alice")
    val bob = Player("Bob")
    val players = listOf(alice, bob)
    val game = Game(players)
    // when
    game.pickUp(alice)
    // then
    val handOfAlice = game.handOf(alice)
    val handOfBob = game.handOf(bob)
    assertThat(handOfAlice).hasSize(8)
    assertThat(handOfBob).hasSize(7)
  }
  
  @Test
  fun `games have stack and pile`() {
    // NOTE: Not everything in a single test case unless feasible!
    // HINT: Game #topCard
    TODO("Beziehung zwischen Game, Stack und Pile (Aggregation oder Komposition?) implementieren!")
  }
  
  @Test
  fun `on games, players play cards from hand or draw from stack`() {
    // NOTE: Not everything in a single test case unless feasible!
    // HINT: Game #lay, Game #pickUp
    TODO("Beziehung zwischen Game, Hand und Stack (Aggregation oder Komposition?) implementieren!")
  }
  
}
