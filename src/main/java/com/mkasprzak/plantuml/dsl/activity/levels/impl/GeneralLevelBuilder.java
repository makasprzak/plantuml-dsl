package com.mkasprzak.plantuml.dsl.activity.levels.impl;

import com.mkasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.mkasprzak.plantuml.dsl.activity.levels.ConditionLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.FirstNodeLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.GeneralLevel;

public class GeneralLevelBuilder implements GeneralLevel {
    private final ActivityGraphBuilder activityGraphBuilder;

    public GeneralLevelBuilder(ActivityGraphBuilder activityGraphBuilder) {
        this.activityGraphBuilder = activityGraphBuilder;
    }

    @Override
    public GeneralLevel activity(String label) {
        activityGraphBuilder.generalLevelActivity(label);
        return this;
    }

    @Override
    public FirstNodeLevel beginAnother() {
        activityGraphBuilder.generalLevelBeginAnother();
        return firstNodeLevel();
    }

    @Override
    public String build() {
        return activityGraphBuilder.build();
    }

    @Override
    public ConditionLevel condition(String label) {
        activityGraphBuilder.generalLevelCondition(label);
        return conditionLevel();
    }

    @Override
    public GeneralLevel end() {
        activityGraphBuilder.generalLevelEnd();
        return this;
    }

    private ConditionLevelBuilder<GeneralLevel> conditionLevel() {
        return new ConditionLevelBuilder<GeneralLevel>(activityGraphBuilder, this);
    }

    private FirstNodeLevelBuilder firstNodeLevel() {
        return new FirstNodeLevelBuilder(activityGraphBuilder);
    }
}
