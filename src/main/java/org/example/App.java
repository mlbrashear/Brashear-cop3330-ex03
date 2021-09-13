package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Declare 2 strings for the quote and the user
        String quote;
        String quotee;
        Scanner sc = new Scanner(System.in);

        //Ask the user for the quote and assign it to the "quote" variable
        System.out.println("What is the quote?");
        quote = sc.nextLine();

        //Ask the user for the quotee and assign it to the "quotee" variable
        System.out.println("Who said it?");
        quotee = sc.nextLine();

        //Print out findings
        System.out.println(quotee + " says, \"" + quote + "\"");

        sc.close();
    }
}