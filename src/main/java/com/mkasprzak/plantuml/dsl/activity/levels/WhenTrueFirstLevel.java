package com.mkasprzak.plantuml.dsl.activity.levels;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.primes.Activity;
import com.mkasprzak.plantuml.dsl.activity.primes.Condition;
import com.mkasprzak.plantuml.dsl.activity.primes.End;

public interface WhenTrueFirstLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        End<WhenTrueFurtherLevel<T>>,
        Activity<WhenTrueFurtherLevel<T>>,
        Condition<ConditionLevel<WhenTrueFurtherLevel<T>>>
{}
