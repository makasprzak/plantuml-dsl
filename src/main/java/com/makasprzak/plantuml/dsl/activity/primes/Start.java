package com.makasprzak.plantuml.dsl.activity.primes;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface Start<T extends ActivityBuilderBase> {
    T start();
}
