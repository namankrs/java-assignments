package com.step.assignments.unocards;

public class IdentityCard implements Dublicable<DuplicateIdentityCard> {
    private String name;
    private int id;

    public IdentityCard(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public DuplicateIdentityCard getDuplicate() {
        return null;
    }
}
