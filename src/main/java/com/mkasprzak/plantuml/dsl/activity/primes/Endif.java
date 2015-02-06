package com.mkasprzak.plantuml.dsl.activity.primes;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface Endif<T extends ActivityBuilderBase> {
    T endIf();
}
