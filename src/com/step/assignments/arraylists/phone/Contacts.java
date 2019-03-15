package com.step.assignments.arraylists.phone;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contacts = new ArrayList<String>();

    public boolean addContact(String contact)
    {
        contacts.add(contact);
        return true;
    }

    public boolean deleteContact(String contact) {
        if (contacts.contains(contact)){
            contacts.remove(contact);
            return true;
        }
        System.out.println("Name not present");
        return false;
    }

    public void modifyContact(String oldContact, String newContact) {
        int indexOfOldContact = contacts.indexOf(oldContact);
        if(indexOfOldContact == -1) {
            System.out.println("Contact not present");
            return;
        }
        contacts.set(indexOfOldContact, newContact);
    }

    public void printContacts() {
        contacts.forEach(System.out::println);
    }
}
