package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class NullableTest {
  @Test
  fun test_isNull() {
    val actual: Boolean? = null
    assertThat(actual).isNull()
  }

  @Test
  fun test_isNotNull() {
    val actual: Boolean? = true
    assertThat(actual).isNotNull()
  }
}
