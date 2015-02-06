package com.mkasprzak.plantuml.dsl.activity.levels.impl;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.mkasprzak.plantuml.dsl.activity.levels.ConditionLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenFalseFirstLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenTrueFirstLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenTrueFurtherLevel;

public class WhenTrueFurtherLevelBuilder<T extends ActivityBuilderBase> implements WhenTrueFurtherLevel<T> {
    private final ActivityGraphBuilder activityGraphBuilder;
    private final T previousLevel;

    public WhenTrueFurtherLevelBuilder(ActivityGraphBuilder activityGraphBuilder, T previousLevel) {
        this.activityGraphBuilder = activityGraphBuilder;
        this.previousLevel = previousLevel;
    }

    @Override
    public WhenTrueFurtherLevel<T> activity(String label) {
        activityGraphBuilder.whenTrueFurtherLevelActivity(label);
        return this;
    }

    @Override
    public ConditionLevel<WhenTrueFurtherLevel<T>> condition(String label) {
        activityGraphBuilder.whenTrueFurtherLevelCondition(label);
        return conditionLevel();
    }

    @Override
    public WhenTrueFurtherLevel<T> end() {
        activityGraphBuilder.whenTrueFurtherLevelEnd();
        return this;
    }

    @Override
    public WhenFalseFirstLevel<T> whenFalse() {
        activityGraphBuilder.whenTrueFurtherLevelWhenFalse();
        return whenFalseFirstLevel();
    }

    @Override
    public WhenTrueFirstLevel<T> elseCondition(String label) {
        activityGraphBuilder.whenTrueFurtherLevelElseCondition(label);
        return new WhenTrueFirstLevelBuilder<T>(activityGraphBuilder, previousLevel);
    }

    private WhenFalseFirstLevelBuilder<T> whenFalseFirstLevel() {
        return new WhenFalseFirstLevelBuilder<T>(activityGraphBuilder, previousLevel);
    }

    private ConditionLevelBuilder<WhenTrueFurtherLevel<T>> conditionLevel() {
        return new ConditionLevelBuilder<WhenTrueFurtherLevel<T>>(activityGraphBuilder, this);
    }
}
