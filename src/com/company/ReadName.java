/*
 * This class is created to take the name of the user in a variable
 */

package com.company;    /* Import com.company package */

import java.util.Scanner;    /* Import Scanner Class */

public class ReadName {
    String name;
    public  String takeName() {     /* new method created */
        System.out.println("Enter Your Name : ");
        Scanner n = new Scanner(System.in);
        name = n.nextLine();    
        System.out.println();
        return name;
    }
}
