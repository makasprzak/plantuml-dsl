package com.makasprzak.plantuml.dsl.activity.levels.impl;

import com.makasprzak.plantuml.dsl.activity.ActivityGraphBuilder;
import com.makasprzak.plantuml.dsl.activity.levels.FirstNodeLevel;
import com.makasprzak.plantuml.dsl.activity.levels.SecondNodeLevel;

public class FirstNodeLevelBuilder implements FirstNodeLevel {

    private final ActivityGraphBuilder activityGraphBuilder;

    public FirstNodeLevelBuilder(ActivityGraphBuilder activityGraphBuilder) {
        this.activityGraphBuilder = activityGraphBuilder;
    }

    @Override
    public SecondNodeLevel activity(String label) {
        activityGraphBuilder.firstNodeActivity(label);
        return next();
    }

    @Override
    public SecondNodeLevel start() {
        activityGraphBuilder.firstNodeStart();
        return next();
    }

    private SecondNodeLevelBuilder next() {
        return new SecondNodeLevelBuilder(activityGraphBuilder);
    }
}
