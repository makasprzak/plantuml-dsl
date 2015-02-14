package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface ConditionStep<T extends ActivityBuilderBase> {
    T condition(String label);
}
