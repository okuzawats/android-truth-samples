package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CollectionTest {
  @Test
  fun test_contains() {
    val actual: List<Int> = listOf(1, 2, 3, 42, 100)
    assertThat(actual)
      .contains(42)
  }

  @Test
  fun test_containsExactly() {
    val actual: List<Int> = listOf(1, 2, 3, 42, 100)
    assertThat(actual)
      .containsExactly(100, 42, 3, 2, 1)
  }

  @Test
  fun test_isInOrder() {
    val actual: List<Int> = listOf(1, 2, 3, 42, 100)
    assertThat(actual)
      .isInOrder()
  }
}