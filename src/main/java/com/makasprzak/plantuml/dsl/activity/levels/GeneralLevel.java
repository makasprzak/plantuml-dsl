package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.steps.*;

public interface GeneralLevel extends
        ActivityBuilderBase,
        EndStep<GeneralLevel>,
        ActivityStep<GeneralLevel>,
        ConditionStep<ConditionLevel<GeneralLevel>>,
        BeginAnotherStep<FirstNodeLevel>,
        BuildStep
{
}
