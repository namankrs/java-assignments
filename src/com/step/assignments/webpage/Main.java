package com.step.assignments.webpage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WebPage interactiveWebPage = new WebPage("this is interactive web page");
        NonInteractiveWebPage nonInteractiveWebPage = new NonInteractiveWebPage("this is non-interactive web page");

        interactiveWebPage.click();
        interactiveWebPage.display("sample text");
        System.out.println(interactiveWebPage.getContent());

        nonInteractiveWebPage.display("another text");
        System.out.println(nonInteractiveWebPage.getContent());
        nonInteractiveWebPage.click();
    }
}
