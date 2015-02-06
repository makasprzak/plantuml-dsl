package com.mkasprzak.plantuml.dsl.activity.levels;

import com.mkasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.mkasprzak.plantuml.dsl.activity.primes.Activity;
import com.mkasprzak.plantuml.dsl.activity.primes.Start;

public interface FirstNodeLevel extends
        ActivityBuilderBase,
        Start<SecondNodeLevel>,
        Activity<SecondNodeLevel>
{}
