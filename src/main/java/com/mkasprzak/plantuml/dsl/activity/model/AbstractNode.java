package com.mkasprzak.plantuml.dsl.activity.model;

public abstract class AbstractNode implements Node{
    protected abstract String toPlantuml();

    @Override
    public String toString() {
        return toPlantuml();
    }
}
