package com.okuzawats.truth

import com.google.common.truth.FailureMetadata
import com.google.common.truth.Subject
import com.google.common.truth.Subject.Factory
import com.google.common.truth.Truth

class UnitSubject private constructor(metadata: FailureMetadata, private val actual: Unit?) :
    Subject(metadata, actual) {

    fun isUnit() =  unit().isEqualTo(Unit)

    fun isNotUnit() = unit().isNotEqualTo(Unit)

    fun unit(): Subject {
        return check("name()").that(actual)
    }

    companion object {
        fun assertThat(actual: Unit?): UnitSubject {
            return Truth.assertAbout(employees()).that(actual)
        }

        fun employees(): Factory<UnitSubject, Unit?> {
            return Factory { metadata: FailureMetadata, subject: Unit? ->
                UnitSubject(
                    metadata,
                    subject
                )
            }
        }
    }
}
