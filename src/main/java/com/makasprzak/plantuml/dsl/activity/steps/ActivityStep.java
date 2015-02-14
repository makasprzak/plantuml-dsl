package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;

public interface ActivityStep<T extends ActivityBuilderBase> {
    T activity(String label);
}
