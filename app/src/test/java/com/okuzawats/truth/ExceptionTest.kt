package com.okuzawats.truth

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ThrowException {
  fun throwException() {
    throw Throwable()
  }
}

class ExceptionTest {
  @Test
  fun test_throwable() {
    var throwable: Throwable? = null
    try {
      ThrowException()
        .throwException()
    } catch (e: Throwable) {
      throwable = e
    }
    assertThat(throwable)
      .isNotNull()
  }
}