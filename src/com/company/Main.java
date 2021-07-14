/*
 * This class is created to execute the program, it is the entry point, The Main Class
 */
package com.company;  /* Import com.company package */
public class Main {
    public static void main(String []args){  /* main method */
        ReadName setName =new ReadName();

        String name =setName.takeName();
         ChooseSet loadFile = new ChooseSet();
        int file = loadFile.takeFile();
        if (file==2){
            ControlStructures mcq = new ControlStructures();
            int constant =mcq.controls();
            int total = mcq.total;
            int numOfWrongAnswers = total-constant;
            int percentage =(constant*100)/total;
            System.out.println(name+", you answered\n"+constant+"\nquestion right ,"+numOfWrongAnswers+"\nquestion wrong for a total\n"+ percentage +"%");
        }
        else if (file==1)
        {
            JavaBasics mcq = new JavaBasics();
            int constant =mcq.javabasics();
            int total = mcq.total;
            int numOfWrongAnswers = total-constant;
            int percentage =(constant*100)/total;
            System.out.println(name+", you answered\n"+constant+"\nquestion right,"+numOfWrongAnswers+"\nquestion wrong for a total\n"+percentage +"%");
        }
    }
}