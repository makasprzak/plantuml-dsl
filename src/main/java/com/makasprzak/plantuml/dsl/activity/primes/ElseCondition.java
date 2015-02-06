package com.makasprzak.plantuml.dsl.activity.primes;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.levels.WhenTrueFirstLevel;

public interface ElseCondition<T extends ActivityBuilderBase> {
    WhenTrueFirstLevel<T> elseCondition(String label);
}
