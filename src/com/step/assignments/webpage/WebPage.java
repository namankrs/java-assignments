package com.step.assignments.webpage;

public  class WebPage extends PDFpage implements Consolable  {
    private String content;

    public WebPage(String content) {
        this.content = content;
    }


    @Override
    public void display(String text) {
        System.out.println(text);

    }

    @Override
    public String getContent() {
        return this.content;
    }

    public void click(){
        System.out.println("you clicked on webpage");
    }
}
