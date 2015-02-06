package com.mkasprzak.plantuml.dsl.activity.primes;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface Activity<T extends ActivityBuilderBase> {
    T activity(String label);
}
