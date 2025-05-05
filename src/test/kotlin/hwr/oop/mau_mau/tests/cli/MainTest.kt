package hwr.oop.mau_mau.tests.cli

import hwr.oop.mau_mau.cli.main
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.extensions.system.captureStandardOut
import org.assertj.core.api.Assertions

class MainTest : AnnotationSpec() {
  
  @Test
  fun `main prints hello world to stdout`() {
    val output = captureStandardOut {
      main(emptyArray())
    }.trim()
    Assertions.assertThat(output).isEqualTo("Hello World!")
  }
  
}