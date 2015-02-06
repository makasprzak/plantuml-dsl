package com.mkasprzak.plantuml.dsl.activity.primes;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface BeginAnother<T extends ActivityBuilderBase> {
    T beginAnother();
}
