package hwr.oop.mau_mau.tests.core

import io.kotest.core.spec.style.AnnotationSpec

class Task02_CardComparabilityTest : AnnotationSpec() {
  
  @Test
  fun `comparable by value`() {
    // NOTE: Not everything in a single test case unless feasible!
    TODO(
      """
      1. Karten sollen nach Kartenwert
      (aufsteigend, klein nach groß: 7-10, Bube, Dame, König, Ass)
      vergleichbar sein!
      """
    )
  }
  
  @Test
  fun `comparable by color`() {
    // NOTE: Not everything in a single test case unless feasible!
    TODO(
      """
        2. Karten sollen getrennt jeweils über Kartenwert
        als auch Kartenfarbe (aufsteigend, Karo, Herz, Pik, Kreuz)
        vergleichbar sein!
      """
    )
  }
  
  @Test
  fun `comparable by combination`() {
    // NOTE: Not everything in a single test case unless feasible!
    TODO(
      """
        Karten sollen kombiniert nach Kartenwert (zuerst)
        und nach Kartenfarbe (danach) üvergleichbar sein!
        (K7, H7, ..., PA, KA)
        """
    )
  }
  
}