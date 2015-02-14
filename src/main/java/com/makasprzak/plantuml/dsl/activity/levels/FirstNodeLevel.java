package com.makasprzak.plantuml.dsl.activity.levels;

import com.makasprzak.plantuml.dsl.activity.ActivityBuilderBase;
import com.makasprzak.plantuml.dsl.activity.steps.ActivityStep;
import com.makasprzak.plantuml.dsl.activity.steps.StartStep;

public interface FirstNodeLevel extends
        ActivityBuilderBase,
        StartStep<SecondNodeLevel>,
        ActivityStep<SecondNodeLevel>
{}
