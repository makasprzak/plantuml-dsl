package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface EndifStep<T extends ActivityBuilderBase> {
    T endIf();
}
