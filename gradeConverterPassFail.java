/*
 * Josh Bartlett
 * Purpose: To take a letter grade and convert it to a number grade and 
 * determine if the grade is passing or failing
 * May 4, 2019
 * Bellevue University
 * gradeConverter.java
 */

import java.util.Scanner;

public class gradeConverterPassFail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // ask user for input, declare inputGrade variable, 
        // add input to variable inputGrade
        System.out.print("Enter a letter grade: ");
        String inputGrade = input.nextLine();
        
        // declare grade variable, convert inputGrade to upper case, 
        // add converted grade to variable grade 
        String grade = inputGrade.toUpperCase();
        int numGrade = 0;
        
        // if chain takes grade variable and compares it to A B C D or F 
        // and outputs the correct statment
        if("A".equals(grade)){
            System.out.println("The numeric value for grade " + grade + 
                " is 4");
            numGrade = 4;
        }
        else if("B".equals(grade)){
            System.out.println("The numeric value for grade " + grade + 
                " is 3");
            numGrade = 3;
        }
        else if("C".equals(grade)){
            System.out.println("The numeric value for grade " + grade +
                " is 2");
            numGrade = 2;
        }
        else if("D".equals(grade)){
            System.out.println("The numeric value for grade " + grade + 
                " is 1");
            numGrade = 1;
        }
        else if("F".equals(grade)){
            System.out.println("The numeric value for grade " + grade + 
                " is 0");
            numGrade = 0;
        }
        else{
            System.out.println(grade + " is an invalid grade");
        }
        
        String pF = passFail(numGrade);
        System.out.println(pF);
        
    }
    
    public static String passFail(int g){
        if(g > 0)
            return "Pass";
        else if(g == 0)
            return "Fail";
        else if (g < 0)
            return "Invalid";
        return null;
    }
    
}
