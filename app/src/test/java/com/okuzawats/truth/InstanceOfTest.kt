package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class InstanceOfTest {
  @Test
  fun test_instanceOf() {
    val actual: Int = 42
    assertThat(actual).isInstanceOf(Comparable::class.java)
  }
}