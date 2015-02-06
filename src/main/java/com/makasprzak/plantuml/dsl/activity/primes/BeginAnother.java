package com.makasprzak.plantuml.dsl.activity.primes;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface BeginAnother<T extends ActivityBuilderBase> {
    T beginAnother();
}
