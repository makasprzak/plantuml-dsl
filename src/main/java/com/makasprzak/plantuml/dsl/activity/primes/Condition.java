package com.makasprzak.plantuml.dsl.activity.primes;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface Condition<T extends ActivityBuilderBase> {
    T condition(String label);
}
