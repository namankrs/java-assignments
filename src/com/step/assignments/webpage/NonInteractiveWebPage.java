package com.step.assignments.webpage;

public class NonInteractiveWebPage extends WebPage implements Displayable,Renderable{

    public NonInteractiveWebPage(String content) {
        super(content);
    }

    @Override
    public void click() { ;
    }
}
