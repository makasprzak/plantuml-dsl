package com.makasprzak.plantuml.dsl.activity.steps;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.levels.WhenTrueFirstLevel;

public interface ElseConditionStep<T extends ActivityBuilderBase> {
    WhenTrueFirstLevel<T> elseCondition(String label);
}
