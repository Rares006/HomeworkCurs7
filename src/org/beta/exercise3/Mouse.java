package org.beta.exercise3;

public class Mouse implements Animal{
    @Override
    public String walk() {
        return "mouse-walking";
    }

    @Override
    public String talk() {
        return "mouse-talking";
    }

    @Override
    public String eat() {
        return "mouse-eating";
    }
}

