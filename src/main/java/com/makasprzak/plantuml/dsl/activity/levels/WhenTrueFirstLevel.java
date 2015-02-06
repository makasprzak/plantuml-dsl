package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.primes.Activity;
import com.makasprzak.plantuml.dsl.activity.primes.End;
import com.makasprzak.plantuml.dsl.activity.primes.Condition;

public interface WhenTrueFirstLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        End<WhenTrueFurtherLevel<T>>,
        Activity<WhenTrueFurtherLevel<T>>,
        Condition<ConditionLevel<WhenTrueFurtherLevel<T>>>
{}
