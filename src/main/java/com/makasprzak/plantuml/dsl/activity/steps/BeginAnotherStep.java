package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface BeginAnotherStep<T extends ActivityBuilderBase> {
    T beginAnother();
}
