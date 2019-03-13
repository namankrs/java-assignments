package com.step.assignments.unocards;

public class XeroxMachine {

    public <O extends Duplicable, D> D makeDuplicate(O original){
            return (D)original.getDuplicate();
        }


    public static void main(String[] args) {
        XeroxMachine xeroxMachine = new XeroxMachine();
        DuplicateUnoCard duplicateUnoCard = xeroxMachine.makeDuplicate(new UnoCard(4, "orange "));
        xeroxMachine.makeDuplicate(new IdentityCard("kannu",1));

    }

}
