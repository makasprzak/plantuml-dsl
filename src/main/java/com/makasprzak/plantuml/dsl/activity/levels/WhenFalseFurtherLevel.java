package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.steps.ActivityStep;
import com.makasprzak.plantuml.dsl.activity.steps.ConditionStep;
import com.makasprzak.plantuml.dsl.activity.steps.EndStep;
import com.makasprzak.plantuml.dsl.activity.steps.EndifStep;

public interface WhenFalseFurtherLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        EndStep<WhenFalseFurtherLevel<T>>,
        ActivityStep<WhenFalseFurtherLevel<T>>,
        ConditionStep<ConditionLevel<WhenFalseFurtherLevel<T>>>,
        EndifStep<T>
{}
