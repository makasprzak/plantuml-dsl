package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface StartStep<T extends ActivityBuilderBase> {
    T start();
}
