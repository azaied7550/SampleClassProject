package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Prepare to accept user input
        Scanner Keyboard = new Scanner(System.in);

        //Create an ArrayList of Person objects
        ArrayList<Person> personList = new ArrayList<>();

        String answer ="y";
        int count=1;

        while (answer.equalsIgnoreCase("y")){

            //Creating a new Person object
            Person newPerson = new Person();

            System.out.print("Enter person " +count+ " first name: ");
            newPerson.setFirstName(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " last name: ");
            newPerson.setLastName(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " address ");
            newPerson.setAddress(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " phone number: ");
            newPerson.setPhoneNumber(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " email: ");
            newPerson.setEmail(Keyboard.nextLine());
            personList.add(newPerson);
            count++;
            System.out.print("Do you want to enter a new person? (Y/N) :");
            answer = Keyboard.nextLine();
        }

        System.out.println();
        count=1;
        for (Person eachPerson: personList){
            eachPerson.getFirstName();
            System.out.println("First Name " +count+ ": " +eachPerson.getFirstName());
            count++;
        }
    }
}
