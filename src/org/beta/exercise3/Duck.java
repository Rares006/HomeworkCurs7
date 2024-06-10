package org.beta.exercise3;

public class Duck implements Animal{
    @Override
    public String walk() {
        return "Duck-walking";
    }

    @Override
    public String talk() {
        return "Duck-talking";
    }

    @Override
    public String eat() {
        return "Duck-eating";
    }
}
