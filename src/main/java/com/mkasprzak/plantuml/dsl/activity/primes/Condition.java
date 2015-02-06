package com.mkasprzak.plantuml.dsl.activity.primes;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface Condition<T extends ActivityBuilderBase> {
    T condition(String label);
}
