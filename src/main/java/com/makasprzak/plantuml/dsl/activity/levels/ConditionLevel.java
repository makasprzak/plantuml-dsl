package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.primes.WhenTrue;

public interface ConditionLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        WhenTrue<WhenTrueFirstLevel<T>>
{}
