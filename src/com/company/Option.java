/*
 * This class is created to check whether the option received is correct or not
 */

package com.company;    /* Import com.company package */

import java.util.Scanner;

public class Option {
    int z;

    public int value() {
        System.out.println("\nYour Choice ; ");
        Scanner c = new Scanner(System.in);     /* New Instance Created called 'c' */
        String choice = c.next();
        System.out.println();
        switch (choice) {
            case "a":
            case "A":          /* Declaring If Else Condition */
                z = 1;
                return z;
            case "b":
            case "B":       /*Initializing If ELSE ladder */
                z = 2;
                return z;
            case "c":
            case "C":
                z = 3;
                return z;
            case "d":
            case "D":
                z = 4;
                return z;
            default:
                System.out.println("Invalid Input");
                value();
                break;
        }
        return z;
    }
}










