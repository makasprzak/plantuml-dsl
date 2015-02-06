package com.makasprzak.plantuml.dsl.activity.levels.impl;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.makasprzak.plantuml.dsl.activity.levels.ConditionLevel;
import com.makasprzak.plantuml.dsl.activity.levels.WhenTrueFirstLevel;

public class ConditionLevelBuilder<T extends ActivityBuilderBase> implements ConditionLevel<T> {
    private final ActivityGraphBuilder activityGraphBuilder;
    private final T previousLevel;

    public ConditionLevelBuilder(ActivityGraphBuilder activityGraphBuilder, T previousLevel) {
        this.activityGraphBuilder = activityGraphBuilder;
        this.previousLevel = previousLevel;
    }

    @Override
    public WhenTrueFirstLevel<T> whenTrue() {
        activityGraphBuilder.conditionLevelWhenTrue();
        return new WhenTrueFirstLevelBuilder<T>(activityGraphBuilder, previousLevel);
    }
}
