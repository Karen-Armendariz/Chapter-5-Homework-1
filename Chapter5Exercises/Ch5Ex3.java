package Chapter5Exercises;

/**
 * @class: Ch5Ex3
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user string
 * return the string entered.
 */

import java.util.Scanner;

public class Ch5Ex3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String inputStr = readString(keyboard);
        System.out.println("String entered: " + inputStr);
    }
    public static String readString(Scanner keyboard)
    {
        System.out.println("Enter a string: ");
        String input = keyboard.nextLine();
        return input;
    }
}