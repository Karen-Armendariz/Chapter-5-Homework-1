package Chapter5Exercises;

/**
 * @class: Ch5Ex1
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user string
 * return the string entered.
 */

import java.util.Scanner;

public class Ch5Ex1
{
    public static void main(String[] args)
      {
         String userIn = getString();
           System.out.println("String entered:" + userIn);
      }
        public static String getString()
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a string ");
            String input = keyboard.nextLine();
            return input;
        }
}