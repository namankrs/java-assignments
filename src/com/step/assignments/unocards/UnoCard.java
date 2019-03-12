package com.step.assignments.unocards;

public class UnoCard implements Dublicable<UnoCard> {
    private String name;

    public UnoCard(String name) {
        this.name = name;
    }

    @Override
    public UnoCard getDuplicate() {
        return new UnoCard(this.name);
    }


}
