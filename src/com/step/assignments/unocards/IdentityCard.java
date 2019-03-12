package com.step.assignments.unocards;

public class IdentityCard implements Dublicable {
    private String name;

    public IdentityCard(String name) {
        this.name = name;
    }

    @Override
    public Object getDuplicate() {
        return new IdentityCard(name);
    }
}
