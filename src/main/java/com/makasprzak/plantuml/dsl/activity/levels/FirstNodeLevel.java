package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.primes.Activity;
import com.makasprzak.plantuml.dsl.activity.primes.Start;

public interface FirstNodeLevel extends
        ActivityBuilderBase,
        Start<SecondNodeLevel>,
        Activity<SecondNodeLevel>
{}
