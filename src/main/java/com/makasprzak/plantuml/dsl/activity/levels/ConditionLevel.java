package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.steps.WhenTrueStep;

public interface ConditionLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        WhenTrueStep<WhenTrueFirstLevel<T>>
{}
