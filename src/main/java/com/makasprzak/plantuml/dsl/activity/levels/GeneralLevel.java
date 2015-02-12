package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.primes.*;

public interface GeneralLevel extends
        ActivityBuilderBase,
        End<GeneralLevel>,
        Activity<GeneralLevel>,
        Condition<ConditionLevel<GeneralLevel>>,
        BeginAnother<FirstNodeLevel>,
        Build
{
}
