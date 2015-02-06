# plantuml-dsl
A Java fluent api for creating [PlantUML](http://plantuml.sourceforge.net/) diagrams (Currently only Activity diagram supported).
Provides an easy to use builder for defining the diagrams. Example usage:

```java
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
```
