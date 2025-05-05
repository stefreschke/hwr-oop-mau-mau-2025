package hwr.oop.mau_mau.tests.core

import hwr.oop.mau_mau.core.Game
import io.kotest.core.spec.style.AnnotationSpec

class Task03_GameRelatedRelationshipsTest : AnnotationSpec() {
  
  @Test
  fun `games have players`() {
    // NOTE: Not everything in a single test case unless feasible!
    // HINT: Game #players, Game #turn
    TODO("Beziehung zwischen Game und Player (Aggregation oder Komposition?) implementieren!")
  }
  
  @Test
  fun `players have hands in games`() {
    // NOTE: Not everything in a single test case unless feasible!
    // HINT: Game #handOf
    TODO("Beziehung zwischen Game, Player und Hand (Aggregation oder Komposition?) implementieren!")
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
