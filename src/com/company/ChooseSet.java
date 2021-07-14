/*
 * This class is created to choose set
 */
package com.company;    /* Import com.company package */

import java.util.Scanner;     /* Import Scanner Class */

public class ChooseSet {
    int set;
    public int takeFile() {     /* new method created */
        System.out.println("Choose Your Multiple Choice Question Set. The Options are : ");
        System.out.println("\n1. Java Basics");
        System.out.println("2. Control Structures");
        System.out.println(" (1or2) : ");
        Scanner m= new Scanner(System.in);
        set = m.nextInt();
        if (set != 1 && set != 2) {
            takeFile();
        }
        return set;
    }
}
