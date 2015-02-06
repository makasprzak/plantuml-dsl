package com.mkasprzak.plantuml.dsl.activity.levels;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.primes.Activity;
import com.mkasprzak.plantuml.dsl.activity.primes.Condition;
import com.mkasprzak.plantuml.dsl.activity.primes.End;

public interface WhenFalseFirstLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        End<WhenFalseFurtherLevel<T>>,
        Activity<WhenFalseFurtherLevel<T>>,
        Condition<ConditionLevel<WhenFalseFurtherLevel<T>>>
{}
