package com.mkasprzak.plantuml.dsl.activity.primes;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface Start<T extends ActivityBuilderBase> {
    T start();
}
