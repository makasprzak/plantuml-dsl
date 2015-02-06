package com.mkasprzak.plantuml.dsl.activity.levels;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.primes.*;

public interface GeneralLevel extends
        ActivityBuilderBase,
        End<GeneralLevel>,
        Activity<GeneralLevel>,
        Condition<ConditionLevel>,
        BeginAnother<FirstNodeLevel>,
        Build
{
}
