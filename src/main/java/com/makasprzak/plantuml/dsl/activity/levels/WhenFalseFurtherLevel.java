package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.primes.Activity;
import com.makasprzak.plantuml.dsl.activity.primes.Condition;
import com.makasprzak.plantuml.dsl.activity.primes.End;
import com.makasprzak.plantuml.dsl.activity.primes.Endif;

public interface WhenFalseFurtherLevel<T extends ActivityBuilderBase> extends
        ActivityBuilderBase,
        End<WhenFalseFurtherLevel<T>>,
        Activity<WhenFalseFurtherLevel<T>>,
        Condition<ConditionLevel<WhenFalseFurtherLevel<T>>>,
        Endif<T>
{}
