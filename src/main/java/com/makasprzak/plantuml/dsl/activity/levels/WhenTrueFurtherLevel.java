package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.steps.*;

public interface WhenTrueFurtherLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        EndStep<WhenTrueFurtherLevel<T>>,
        ActivityStep<WhenTrueFurtherLevel<T>>,
        ConditionStep<ConditionLevel<WhenTrueFurtherLevel<T>>>,
        WhenFalseStep<WhenFalseFirstLevel<T>>,
        ElseConditionStep<T>
{}
