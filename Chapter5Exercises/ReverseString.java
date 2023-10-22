package Chapter5Exercises;
/**
 * @class: ReverseString
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user string
 * return the string entered in reverse
 */
import java.util.Scanner;

public class ReverseString
{
    public static String reverseString(String str) //method reserveString created
    {
        String newStr = ""; // empty string initialization, newStr will store reversed string.

        for (int i = str.length()-1; i >= 0; i--) // for loop, iterates thru input str, in reverse, starting
                                                    //at the end and working backwards.
        {
            newStr = newStr + str.charAt(i); // input string appended in reverse order, one character at a time
        }
        return newStr; // newStr is returned as the string in reverse.
    }

    public static void main(String[] args) //main method
    {
        Scanner str2 = new Scanner(System.in); // str2 object is created in Scanner class, reads keyboard input
        System.out.print("Enter a string   "); // user prompt to enter a string
        String input = str2.nextLine(); //input string is assigned to variable input.
        String new2 = reverseString(input); // reverseString method is called, input is the arguement, new2 variable stores
                                            // the reverse string.

        System.out.print(new2); // new2 variable (reversed string) is printed.
    }
}
