package com.mkasprzak.plantuml.dsl.activity.levels;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.primes.WhenTrue;

public interface ConditionLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        WhenTrue<WhenTrueFirstLevel<T>>
{}
