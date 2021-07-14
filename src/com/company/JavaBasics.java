/*
        * This class is created to read the java.CSV class which consists the questions and their answers
 */
package com.company; /* Import com.company package */

import java.io.File;  /* Import File Class */
import java.io.FileNotFoundException;  /* Import FileNotFoundException Class */
import java.util.Scanner;  /* Import Scanner Class */

public class JavaBasics {
    int total;
    String filename = "java-basics.csv";    /* Import CSV File  */
    File file = new File (filename);
    int constant = 0;
    public int javabasics() {   /* new method created */
        try{                    /* Implementing Try Catch */
            Scanner B = new Scanner(file);
            while (B.hasNext()) {    /* Declaring While Condition */
                String data = B.nextLine();
                String[] split = data.split(",");
                System.out.println();
                /* Taking Values in an array */
                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]);
                System.out.println(split[3]);
                System.out.println(split[4]);
                int answer = Integer.parseInt(split[5]);
                Option a = new Option();
                int set = a.value();
                if (set == answer) {    /* Declaring If Else Condition */
                    System.out.println("Correct");
                    System.out.println();
                    constant++;
                } else {
                    System.out.println("Wrong answer, the correct answer is " + split[answer]);
                    System.out.println();
                }
                total++;
            }
            B.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return constant;
    }
}
