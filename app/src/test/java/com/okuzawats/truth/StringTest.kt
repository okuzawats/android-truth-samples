package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class StringTest {
  @Test
  fun test_isEqualTo() {
    val actual = "hello world"
    assertThat(actual)
      .isEqualTo("hello world")
  }

  @Test
  fun test_ignoreCase_isEqualTo() {
    val actual = "hello world"
    assertThat(actual)
      .ignoringCase()
      .isEqualTo("HELLO WORLD")
  }

  @Test
  fun test_hasLength() {
    val actual = "hello world"
    assertThat(actual)
      .hasLength(11)
  }

  @Test
  fun test_startsWith() {
    val actual = "hello world"
    assertThat(actual)
      .startsWith("hello")
  }

  @Test
  fun test_endsWith() {
    val actual = "hello world"
    assertThat(actual)
      .endsWith("world")
  }

  @Test
  fun test_isEmpty() {
    val actual = ""
    assertThat(actual)
      .isEmpty()
  }

  @Test
  fun test_isNotEmpty() {
    val actual = "hello world"
    assertThat(actual)
      .isNotEmpty()
  }

  @Test
  fun test_contains() {
    val actual = "hello world"
    assertThat(actual)
      .contains("wor")
  }

  @Test
  fun test_doesNotContains() {
    val actual = "hello world"
    assertThat(actual)
      .doesNotContain("zzz")
  }

  @Test
  fun test_containsMatch() {
    val actual = "hello world"
    assertThat(actual)
      .containsMatch("^hello [a-z]+")
  }

  @Test
  fun testDoesNotContainMatch() {
    val actual = "hello world"
    assertThat(actual)
      .doesNotContainMatch("^[A-Z]+")
  }
}