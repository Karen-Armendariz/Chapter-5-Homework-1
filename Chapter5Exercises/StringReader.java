package Chapter5Exercises;

/**
 * @class: StringReader
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user string
 * return the string entered.
 */

import java.util.Scanner;

public class StringReader  //StringReader class name defined.
{
    public String readString()   //String is type, readString is method within StringReader class.
    {
        Scanner scanner = new Scanner(System.in);   //object (scanner) is created
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();          //entered text stored in "input" variable.
                                                    // .nextLine is method to Scanner object "scanner"
        scanner.close();
        return input;                               //readString method returns the text held in "input" variable
    }
    public static void main(String[] args)          //main method
    {
        StringReader stringReader = new StringReader();     // Create an object (stringReader) of the class StringReader.
                                                            // stringReader variable will access readString method below.
        String userInput = stringReader.readString();       // Call the object (stringReader) with .readString method from
                                                            // the main method.  userInput variable stores the entered string.
        System.out.println("You entered: " + userInput);    //userInput variable is printed with the message.
    }
}