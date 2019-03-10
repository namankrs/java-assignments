package com.step.assignments.arraylists.phone;

import java.util.Scanner;

public class MobilePhone {
    private static Contacts contacts = new Contacts();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printOptions();
        while (scanner.hasNextLine()) {
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 0:
                    contacts.printContacts();
                    break;

                case 1:
                    System.out.println("Enter new contact");
                    contacts.addContact(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("enter contact to modify");
                    String oldContact = scanner.nextLine();
                    System.out.println("enter new contact");
                    String newContact = scanner.nextLine();
                    contacts.modifyContact(oldContact, newContact);
                    break;
                case 3:
                    System.out.println("enter contact to remove");
                    contacts.deleteContact(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("thank you for using");
                    return;
                case 5:
                    printOptions();
                    break;
                default:
                    System.out.println("invalid option, please try again");
                    break;
            }
            System.out.println("Done. Enter next choice");
        }
    }

    private static void printOptions() {
        System.out.println("Enter 0 to view contacts");
        System.out.println("Enter 1 to add contact");
        System.out.println("Enter 2 to modify contact");
        System.out.println("Enter 3 to remove contact");
        System.out.println("Enter 4 to exit");
        System.out.println("Enter 5 to see options");
    }

}
