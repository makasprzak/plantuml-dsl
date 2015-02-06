package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.primes.*;

public interface WhenTrueFurtherLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        End<WhenTrueFurtherLevel<T>>,
        Activity<WhenTrueFurtherLevel<T>>,
        Condition<ConditionLevel<WhenTrueFurtherLevel<T>>>,
        WhenFalse<WhenFalseFirstLevel<T>>,
        ElseCondition<T>
{}
