package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.steps.ActivityStep;
import com.makasprzak.plantuml.dsl.activity.steps.EndStep;
import com.makasprzak.plantuml.dsl.activity.steps.ConditionStep;

public interface WhenTrueFirstLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        EndStep<WhenTrueFurtherLevel<T>>,
        ActivityStep<WhenTrueFurtherLevel<T>>,
        ConditionStep<ConditionLevel<WhenTrueFurtherLevel<T>>>
{}
