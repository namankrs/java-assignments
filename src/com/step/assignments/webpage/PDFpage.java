package com.step.assignments.webpage;

public  class PDFpage implements Renderable{
    private String content;

    public PDFpage(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
