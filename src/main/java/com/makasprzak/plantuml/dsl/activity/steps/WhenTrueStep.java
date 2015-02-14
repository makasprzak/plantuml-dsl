package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface WhenTrueStep<T extends ActivityBuilderBase> {
    T whenTrue();
}
