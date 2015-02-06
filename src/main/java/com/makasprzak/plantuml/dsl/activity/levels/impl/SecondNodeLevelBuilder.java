package com.makasprzak.plantuml.dsl.activity.levels.impl;

import com.makasprzak.plantuml.dsl.activity.levels.GeneralLevel;
import com.makasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.makasprzak.plantuml.dsl.activity.levels.ConditionLevel;
import com.makasprzak.plantuml.dsl.activity.levels.SecondNodeLevel;

public class SecondNodeLevelBuilder implements SecondNodeLevel {
    private final ActivityGraphBuilder activityGraphBuilder;

    public SecondNodeLevelBuilder(ActivityGraphBuilder activityGraphBuilder) {
        this.activityGraphBuilder = activityGraphBuilder;
    }

    @Override
    public GeneralLevel activity(String label) {
        activityGraphBuilder.secondNodeActivity(label);
        return generalLevel();
    }

    @Override
    public ConditionLevel<GeneralLevel> condition(String label) {
        activityGraphBuilder.secondNodeCondition(label);
        return conditionLevel();
    }

    @Override
    public GeneralLevel end() {
        activityGraphBuilder.secondNodeEnd();
        return generalLevel();
    }

    private ConditionLevelBuilder<GeneralLevel> conditionLevel() {
        return new ConditionLevelBuilder<GeneralLevel>(activityGraphBuilder, generalLevel());
    }

    private GeneralLevelBuilder generalLevel() {
        return new GeneralLevelBuilder(activityGraphBuilder);
    }
}
