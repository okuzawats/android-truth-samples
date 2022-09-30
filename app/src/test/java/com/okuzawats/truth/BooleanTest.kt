package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class BooleanTest {
  @Test
  fun test_isTrue() {
    val actual: Boolean = true
    assertThat(actual).isTrue()
  }

  @Test
  fun test_isFalse() {
    val actual: Boolean = false
    assertThat(actual).isFalse()
  }
}
