package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ComparableTest {
  @Test
  fun test_isGreaterThan() {
    val actual: Int = 42
    assertThat(actual).isGreaterThan(0) // >
    assertThat(actual).isGreaterThan(41) // >
    // assertThat(actual).isGreaterThan(42) // >
  }

  @Test
  fun test_isLessThan() {
    val actual: Int = 42
    assertThat(actual).isLessThan(100) // <
    assertThat(actual).isLessThan(43) // <
    // assertThat(actual).isLessThan(42) // <
  }

  @Test
  fun test_isAtLeast() {
    val actual: Int = 42
    assertThat(actual).isAtLeast(0) // >=
    assertThat(actual).isAtLeast(42) // >=
  }

  @Test
  fun test_isAtMost() {
    val actual: Int = 42
    assertThat(actual).isAtMost(100)  // <=
    assertThat(actual).isAtMost(42)  // <=
  }

  @Test
  fun test_isEquivalentAccordingToCompareTo() {
    val actual: Comparable<Int> = 42 // IntならisEqualToを使うべき
    assertThat(actual).isEquivalentAccordingToCompareTo(42)
  }

  @Test
  fun test_isIn() {
    val actual: Int = 42
    assertThat(actual).isIn(0..100)
  }

  @Test
  fun test_isNotIn() {
    val actual: Int = 42
    assertThat(actual).isNotIn(-100 until 0)
  }
}