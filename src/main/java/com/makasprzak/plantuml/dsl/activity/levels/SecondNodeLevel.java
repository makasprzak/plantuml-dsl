package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.steps.ActivityStep;
import com.makasprzak.plantuml.dsl.activity.steps.EndStep;
import com.makasprzak.plantuml.dsl.activity.steps.ConditionStep;

public interface SecondNodeLevel extends
        ActivityBuilderBase,
        EndStep<GeneralLevel>,
        ActivityStep<GeneralLevel>,
        ConditionStep<ConditionLevel<GeneralLevel>>
{}
