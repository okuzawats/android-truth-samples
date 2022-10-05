package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class StringTest {
  @Test
  fun test_isEqualTo() {
    val actual: String = "hello world"
    assertThat(actual)
      .isEqualTo("hello world")
  }

  @Test
  fun test_ignoreCase_isEqualTo() {
    val actual: String = "hello world"
    assertThat(actual)
      .ignoringCase()
      .isEqualTo("HELLO WORLD")
  }

  @Test
  fun test_hasLength() {
    val actual: String = "hello world"
    assertThat(actual)
      .hasLength(11)
  }

  @Test
  fun test_startsWith() {
    val actual: String = "hello world"
    assertThat(actual)
      .startsWith("hello")
  }

  @Test
  fun test_endsWith() {
    val actual: String = "hello world"
    assertThat(actual)
      .endsWith("world")
  }

  @Test
  fun test_isEmpty() {
    val actual: String = ""
    assertThat(actual)
      .isEmpty()
  }

  @Test
  fun test_isNotEmpty() {
    val actual: String = "hello world"
    assertThat(actual)
      .isNotEmpty()
  }

  @Test
  fun test_contains() {
    val actual: String = "hello world"
    assertThat(actual)
      .contains("wor")
  }

  @Test
  fun test_doesNotContains() {
    val actual: String = "hello world"
    assertThat(actual)
      .doesNotContain("zzz")
  }

  @Test
  fun test_containsMatch() {
    val actual: String = "hello world"
    assertThat(actual)
      .containsMatch("^hello [a-z]+")
  }

  @Test
  fun testDoesNotContainMatch() {
    val actual: String = "hello world"
    assertThat(actual)
      .doesNotContainMatch("^[A-Z]+")
  }
}