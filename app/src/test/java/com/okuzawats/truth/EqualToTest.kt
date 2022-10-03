package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SomeClass {
  override fun equals(other: Any?): Boolean {
    return other is SomeClass
  }
}

class OtherClass

class EqualToTest {
  @Test
  fun test_isEqualTo() {
    val actual = 40 + 2
    assertThat(actual).isEqualTo(42)
  }

  @Test
  fun test_someClass_isEqualTo() {
    val actual = SomeClass()
    val expected = SomeClass()
    // SomeClassは同じ型同士で比較した時に `equalTo` がtrueを返す
    assertThat(actual).isEqualTo(expected)
  }

  @Test
  fun test_otherClass_isNotEqualTo() {
    val actual = OtherClass()
    val expected = OtherClass()
    assertThat(actual).isNotEqualTo(expected)
  }
}
