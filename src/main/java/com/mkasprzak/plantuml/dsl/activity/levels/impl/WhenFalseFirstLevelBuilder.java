package com.mkasprzak.plantuml.dsl.activity.levels.impl;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.mkasprzak.plantuml.dsl.activity.levels.ConditionLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenFalseFirstLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenFalseFurtherLevel;

public class WhenFalseFirstLevelBuilder<T extends ActivityBuilderBase> implements WhenFalseFirstLevel<T> {
    private final ActivityGraphBuilder activityGraphBuilder;
    private final T previousLevel;

    public WhenFalseFirstLevelBuilder(ActivityGraphBuilder activityGraphBuilder, T previousLevel) {
        this.activityGraphBuilder = activityGraphBuilder;
        this.previousLevel = previousLevel;
    }

    @Override
    public WhenFalseFurtherLevel<T> activity(String label) {
        activityGraphBuilder.whenFalseFirstLevelActivity(label);
        return whenFalseFurtherLevel();
    }

    @Override
    public ConditionLevel<WhenFalseFurtherLevel<T>> condition(String label) {
        activityGraphBuilder.whenFalseFirstLevelCondition(label);
        return conditionLevel();
    }

    @Override
    public WhenFalseFurtherLevel<T> end() {
        activityGraphBuilder.whenFalseFirstLevelEnd();
        return whenFalseFurtherLevel();
    }

    private ConditionLevelBuilder<WhenFalseFurtherLevel<T>> conditionLevel() {
        return new ConditionLevelBuilder<WhenFalseFurtherLevel<T>>(activityGraphBuilder, whenFalseFurtherLevel());
    }

    private WhenFalseFurtherLevelBuilder<T> whenFalseFurtherLevel() {
        return new WhenFalseFurtherLevelBuilder<T>(activityGraphBuilder, previousLevel);
    }
}
