package com.okuzawats.truth;

import static com.google.common.truth.Truth.assertAbout;

import androidx.annotation.Nullable;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import kotlin.Unit;

public class UnitSubject extends Subject {
  public static UnitSubject assertThat(@Nullable Unit actual) {
    return assertAbout(employees()).that(actual);
  }

  public static Subject.Factory<UnitSubject, Unit> employees() {
    return UnitSubject::new;
  }

  private final Unit actual;
  private UnitSubject(FailureMetadata metadata, @Nullable Unit subject) {
    super(metadata, subject);
    this.actual = subject;
  }

  public void isUnit() {
    unit().isEqualTo(Unit.INSTANCE);
  }

  public void isNotUnit() {
    unit().isNotEqualTo(Unit.INSTANCE);
  }

  public Subject unit() {
    return check("name()").that(actual);
  }
}
