package Chapter5Exercises;
/**
 * @class: isPalindrome1
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user string
 * return if the string is palindrome or not.
 */
import java.util.Scanner;

public class isPalindrome1
{
    public boolean isPalindrome(String str)  //define method isPalindrome. boolean return type
    {
        str = str.toLowerCase();         //converts str to lowercase to simplify
        int left = 0;                    // initialize left side to index 0, to start
        int right = str.length() - 1;    //initialize right side to str.length-1 to start at end of string.

        while (left < right)    //while loop continues as long as left side is less than right side, all characters compared.
                                //these will work from ends toward middle of string.
        {
            if (str.charAt(left) !=str.charAt(right))   //checks if char at left index is not the same as char at right index.
            {
                return false;   //if not equal, then not palindrome, then false.
            }                   //if they are equal, loop continues.
            left++;             //left increments one to the right.
            right--;            //right increments one to the left.
        }                       //loop continues until left !< right, all characters will have been compared.
       return true;              //if no unmatched characters found, then isPalindrome is true.
    }                            // end of isPalindrome method.

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);     //input is the object of the Scanner class.
        System.out.println("Enter a string: ");     //print message, user prompt.
        String strName = input.nextLine();          //user input is stored in variable strName.
        isPalindrome1 name2 = new isPalindrome1();  // instance of isPalindrome1 class is created: name2.
                                                    // calls the isPalindrome method.
        if(name2.isPalindrome(strName))             // calls isPalindrome method with user input strName.
        {
            System.out.println("true");             //if isPalindrome method returns true, then prints true.
        }
        else
        {
            System.out.println("false");            //if isPalindrome method returns false, then prints false.
        }
    }
}


