package com.mkasprzak.plantuml.dsl.activity;

import com.mkasprzak.plantuml.dsl.activity.levels.FirstNodeLevel;
import com.mkasprzak.plantuml.dsl.activity.levels.impl.FirstNodeLevelBuilder;
import com.mkasprzak.plantuml.dsl.activity.model.AbstractNode;
import com.mkasprzak.plantuml.dsl.activity.model.Node;

import java.util.LinkedList;
import java.util.List;

public class ActivityGraphBuilder {

    private final List<Node> nodes = new LinkedList<Node>();

    private ActivityGraphBuilder(){}

    public static FirstNodeLevel activityGraph() {
        ActivityGraphBuilder activityGraphBuilder = new ActivityGraphBuilder();
        return new FirstNodeLevelBuilder(activityGraphBuilder);
    }

    public void firstNodeActivity(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "\""+label+"\" ";
            }
        });
    }

    public void firstNodeStart() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "(*) ";
            }
        });
    }

    public void secondNodeActivity(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "--> \""+label+"\"\n";
            }
        });
    }

    public void secondNodeCondition(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "--> if \""+label+"\" then\n";
            }
        });
    }

    public void secondNodeEnd() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "--> (*)\n";
            }
        });
    }

    public void generalLevelActivity(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "--> "+label+"\n";
            }
        });
    }

    public void generalLevelBeginAnother() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "\n";
            }
        });
    }

    public void generalLevelCondition(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "--> if \""+label+"\" then\n";
            }
        });
    }

    public void generalLevelEnd() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "--> (*)\n";
            }
        });
    }

    public void conditionLevelWhenTrue() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "  -->[true] ";
            }
        });
    }

    public void whenTrueFirstLevelActivity(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "\""+label+"\"\n";
            }
        });
    }

    public void whenTrueFirstLevelCondition(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "if \""+label+"\" then\n";
            }
        });
    }

    public void whenTrueFirstLevelEnd() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "(*)\n";
            }
        });
    }

    public void whenTrueFurtherLevelActivity(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "  --> \""+label+"\"\n";
            }
        });
    }

    public void whenTrueFurtherLevelCondition(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "  --> if \""+label+"\" then\n";
            }
        });
    }

    public void whenTrueFurtherLevelEnd() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "  --> (*)";
            }
        });
    }

    public void whenTrueFurtherLevelWhenFalse() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "else\n" +
                       "  -->[false] ";
            }
        });
    }

    public void whenTrueFurtherLevelElseCondition(final String label) {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "else\n" +
                       "  if \""+label+"\" then\n";
            }
        });

    }

    public void whenFalseFirstLevelActivity(String label) {
        whenTrueFirstLevelActivity(label);
    }

    public void whenFalseFirstLevelCondition(String label) {
        whenTrueFirstLevelCondition(label);
    }

    public void whenFalseFirstLevelEnd() {
        whenTrueFirstLevelEnd();
    }

    public void whenFalseFurtherLevelActivity(String label) {
        whenTrueFirstLevelActivity(label);
    }

    public void whenFalseFurtherLevelCondition(String label) {
        whenTrueFirstLevelCondition(label);
    }

    public void whenFalseFurtherLevelEnd() {
        whenTrueFirstLevelEnd();
    }

    public void whenFalseFurtherLevelEndIf() {
        nodes.add(new AbstractNode() {
            @Override
            protected String toPlantuml() {
                return "endif\n";
            }
        });
    }

    public String build() {
        StringBuilder stringBuilder = new StringBuilder()
                .append("@startuml\n")
                .append('\n');
        for (Node node : nodes) {
            stringBuilder.append(node);
        }

        return stringBuilder.append('\n')
                .append("@enduml\n")
                .toString();
    }
}
