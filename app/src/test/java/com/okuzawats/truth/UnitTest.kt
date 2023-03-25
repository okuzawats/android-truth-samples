package com.okuzawats.truth

import com.okuzawats.truth.UnitSubject.Companion.assertThat
import org.junit.Test

class UnitTest {
  @Test
  fun test_isNotNull() {
    val actual: Unit? = null
    assertThat(actual).isNotUnit()
  }

  @Test
  fun test_isNull() {
    val actual: Unit? = Unit
    assertThat(actual).isUnit()
  }
}
