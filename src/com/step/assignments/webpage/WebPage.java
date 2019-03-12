package com.step.assignments.webpage;

public  class WebPage implements Displayable,Renderable  {
    private String content;

    public WebPage(String content) {
        this.content = content;
    }



    public void display(String text) {
        System.out.println(text);

    }


    public String getContent() {
        return this.content;
    }

    public void click(){
        System.out.println("you clicked on webpage");
    }
}
