package Chapter5Exercises;
/**
 * @class: FibonacciSequence
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user input and return a Fibonacci Sequence
 * equal to that input in length.
 */
import java.util.Scanner;

public class FibonacciSequence
{
    public void printFib(int num)
    {
        int count = 0;
        int startNumber = 0;
        int startNumber2 = 1;

        while (count < num)
        {
            System.out.print(startNumber + " , ");

            int nextNumber = startNumber + startNumber2;
            startNumber = startNumber2;
            startNumber2 = nextNumber;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        FibonacciSequence fibSeq = new FibonacciSequence();
        boolean printAnother = true;

        while (printAnother)
        {
            System.out.println("Enter number of Fibonacci numbers to generate:");
            int num = input.nextInt();
            fibSeq.printFib(num);

            System.out.println("Do you want to print another sequence?");
            String answer = input.next();
            printAnother = answer.equalsIgnoreCase("yes");
        }
    }
}