package com.mkasprzak.plantuml.dsl.activity.primes;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.levels.WhenTrueFirstLevel;

public interface ElseCondition<T extends ActivityBuilderBase> {
    WhenTrueFirstLevel<T> elseCondition(String label);
}
