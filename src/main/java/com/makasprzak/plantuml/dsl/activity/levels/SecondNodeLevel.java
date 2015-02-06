package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.primes.Activity;
import com.makasprzak.plantuml.dsl.activity.primes.End;
import com.makasprzak.plantuml.dsl.activity.primes.Condition;

public interface SecondNodeLevel extends
        ActivityBuilderBase,
        End<GeneralLevel>,
        Activity<GeneralLevel>,
        Condition<ConditionLevel<GeneralLevel>>
{}
