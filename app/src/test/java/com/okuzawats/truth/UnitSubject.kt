package com.okuzawats.truth

import com.google.common.truth.FailureMetadata
import com.google.common.truth.Subject
import com.google.common.truth.Subject.Factory
import com.google.common.truth.Truth.assertAbout

class UnitSubject private constructor(
  metadata: FailureMetadata,
  private val actual: Unit?,
) : Subject(metadata, actual) {

  /**
   * assert that actual is Unit.
   */
  fun isUnit() = unit().isEqualTo(Unit)

  /**
   * assert that actual is NOT Unit.
   */
  fun isNotUnit() = unit().isNotEqualTo(Unit)

  private fun unit(): Subject = check("unit()").that(actual)

  companion object {
    /**
     * start assertion of an object with type Unit?
     */
    fun assertThat(actual: Unit?): UnitSubject = assertAbout(unit()).that(actual)

    private fun unit(): Factory<UnitSubject, Unit?> = Factory(::UnitSubject)
  }
}
