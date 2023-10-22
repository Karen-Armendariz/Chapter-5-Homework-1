package Chapter5Exercises;
/**
 * @class: IsPrime
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user integer and
 * return if the integer is a prime number or not a prime number
 */
import java.util.Scanner;

public class IsPrime
{
    public static boolean isPrime(int number) //method isPrime, return type boolean, true or false.
    {
        if(number <=1 || number %2 == 0 || number %3 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args) //main method
   {
        Scanner input = new Scanner(System.in); //input object of Scanner class created to read user input from keyboard.
        System.out.print("Enter an integer: ");
        int number = input.nextInt();  //user input is read and assigned to number variable
        boolean answer = isPrime(number);   //calls isPrime method, stores input value in answer.
        if(answer)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
   }
}
