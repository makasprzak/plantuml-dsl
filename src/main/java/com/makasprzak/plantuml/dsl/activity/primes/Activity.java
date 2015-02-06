package com.makasprzak.plantuml.dsl.activity.primes;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface Activity<T extends ActivityBuilderBase> {
    T activity(String label);
}
