package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface EndStep<T extends ActivityBuilderBase> {
    T end();
}
