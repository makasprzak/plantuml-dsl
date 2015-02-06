package com.makasprzak.plantuml.dsl.activity.levels.impl;

import com.makasprzak.plantuml.dsl.activity.levels.GeneralLevel;
import com.makasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.makasprzak.plantuml.dsl.activity.levels.ConditionLevel;
import com.makasprzak.plantuml.dsl.activity.levels.FirstNodeLevel;

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
