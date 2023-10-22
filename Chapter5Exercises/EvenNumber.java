package Chapter5Exercises;
/**
 * @class: EvenNumber
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user number
 * return if the number is even or odd.
 */
import java.util.Scanner;

public class EvenNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean isEven = isEven(number);
        printEven(isEven);

    }
    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void printEven(boolean isEven)
    {
        if(isEven)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
