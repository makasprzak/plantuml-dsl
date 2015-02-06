package com.mkasprzak.plantuml.dsl.activity;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.mkasprzak.plantuml.dsl.activity.ActivityGraphBuilder.activityGraph;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.fest.assertions.Assertions.assertThat;

public class ActivityGraphBuilderTest {
    @Test
    public void shouldCreateBasicActivityGraphWithStartEndAndOneActivity() throws Exception {
        assertThat(
                activityGraph()
                        .start()
                        .activity("Some Activity")
                        .end()
                        .build()
        ).isEqualTo(read("/basicActivityGraphWithStartEndAndOneActivity.plantuml"));

    }

    @Test
    public void shouldCreateActivityGraphWithJoin() throws Exception {
        assertThat(
                activityGraph()
                        .activity("Source 1")
                        .activity("Some activity")
                        .end()
                .beginAnother()
                        .activity("Source 2")
                        .activity("Some other activity")
                        .end()
                .build()
        ).isEqualTo(read("/activityGraphWithJoin.plantuml"));

    }

    @Test
    public void shouldCreateActivityGraphWithCondition() throws Exception {
        assertThat(
                activityGraph()
                        .start()
                        .condition("A Condition")
                            .whenTrue()
                                .activity("When true action")
                            .whenFalse()
                                .activity("When false action")
                        .endIf()
                        .beginAnother()
                            .activity("When true action").end()
                        .beginAnother()
                            .activity("When false action").end()
                .build()
        ).isEqualTo(read("/activityGraphWithCondition.plantuml"));

    }

    @Test
    public void shouldCreateActivityGraphWithMultiCondition() throws Exception {
        assertThat(
                activityGraph()
                        .start()
                        .condition("A Condition")
                            .whenTrue()
                                .activity("When true action")
                            .elseCondition("Another condition")
                                .activity("This was else if")
                            .whenFalse()
                                .activity("When false action")
                                .condition("Nested condition")
                                    .whenTrue()
                                        .activity("When nested condition true")
                                    .whenFalse()
                                        .activity("When nested condition false")
                                .endIf()
                        .endIf()
                        .beginAnother()
                            .activity("When true action").end()
                        .beginAnother()
                            .activity("When false action").end()
                .build()
        ).isEqualTo(read("/activityGraphWithMultiCondition.plantuml"));

    }

    private String read(String path) throws IOException {
        return readFileToString(new File(getClass().getResource(path).getFile()),(String)null).replaceAll("\\r","");
    }
}