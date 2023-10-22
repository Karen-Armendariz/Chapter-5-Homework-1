package Chapter5Exercises;
/**
 * @class: ReadAString
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user string
 * return the string entered.
 */
import java.util.Scanner;

public class ReadAStringUsingStatic
{
    public static String readstring(Scanner sc)  //defines static method readstring in the , sc is the object of
                                                //Scanner class.
    {
        System.out.println("Please enter a string: ");  // this line asks for input from user to enter the string.
        String inputStr = sc.nextLine();    // reads the input from the user, takes user input and assigns it to the
                                            // inputStr variable
        return inputStr;  //returns the user input string to the called readsting method below.
    }
    public static void main(String[] args)  // declaration of the main method
    {
        Scanner sc = new Scanner(System.in); // new Scanner object created (sc), reads keyboard input
        String inputStr = ReadAStringUsingStatic.readstring(sc); //readstring method is called and the string is
                                                                // held by the inputStr variable.
        System.out.println("You entered:  "  +inputStr);  // message is displayed with the inputStr entry appended to it.
    }
}
