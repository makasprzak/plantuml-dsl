package com.mkasprzak.plantuml.dsl.activity.levels.impl;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.mkasprzak.plantuml.dsl.activity.levels.ConditionLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenTrueFirstLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenTrueFurtherLevel;

public class WhenTrueFirstLevelBuilder<T extends ActivityBuilderBase> implements WhenTrueFirstLevel<T> {
    private final ActivityGraphBuilder activityGraphBuilder;
    private final T previousLevel;

    public WhenTrueFirstLevelBuilder(ActivityGraphBuilder activityGraphBuilder, T previousLevel) {
        this.activityGraphBuilder = activityGraphBuilder;
        this.previousLevel = previousLevel;
    }

    @Override
    public WhenTrueFurtherLevel<T> activity(String label) {
        activityGraphBuilder.whenTrueFirstLevelActivity(label);
        return whenTrueFurtherLevel();
    }

    @Override
    public ConditionLevel<WhenTrueFurtherLevel<T>> condition(String label) {
        activityGraphBuilder.whenTrueFirstLevelCondition(label);
        return conditionLevel();
    }

    @Override
    public WhenTrueFurtherLevel<T> end() {
        activityGraphBuilder.whenTrueFirstLevelEnd();
        return whenTrueFurtherLevel();
    }

    private ConditionLevelBuilder<WhenTrueFurtherLevel<T>> conditionLevel() {
        return new ConditionLevelBuilder<WhenTrueFurtherLevel<T>>(activityGraphBuilder, whenTrueFurtherLevel());
    }

    private WhenTrueFurtherLevelBuilder<T> whenTrueFurtherLevel() {
        return new WhenTrueFurtherLevelBuilder<T>(activityGraphBuilder, previousLevel);
    }
}
