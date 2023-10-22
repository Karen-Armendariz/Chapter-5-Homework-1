package Chapter5Exercises;
/**
 * @class: SumExample
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept two values and add return the addition of them.
 *
 */
import java.util.Scanner;

public class SumExample   //different methods with same name, different parameter types.
{
    public double sum(double a, double b)    // Method to sum two double values
    {
        System.out.println("double sum method");
        return a + b;
    }
    public double sum(int a, int b)     // Method to sum two int values
    {
        System.out.println("int sum method");
        return a + b;
    }
    public double sum(double a, int b)   // Method to sum a double and an int
    {
        System.out.println("double-int sum method");
        return a + b;
    }

    public static void main(String[] args) // main method
    {
        SumExample ex1 = new SumExample(); //object of SumExample class is created, ex1 is the object.
        Scanner input = new Scanner(System.in); //input object of Scanner class created to read keyboard input.

        System.out.print("Enter double a : ");
        double doubleA = input.nextDouble(); //user input assigned to doubleA variable
        System.out.print("Enter double b : ");
        double doubleB = input.nextDouble(); //user input assigned to doubleB variable
        double result1 = ex1.sum(doubleA,doubleB);     // two double values, sum method used to calculate
                                                        //sum and stores the values in result1 variable
        System.out.println("Result 1: " + result1);


        System.out.print("Enter int a : ");
        int intA = input.nextInt();
        System.out.print("Enter int b : ");
        int intB = input.nextInt();
        double result2 = ex1.sum(intA,intB);         // two int values
        System.out.println("Result 2: " + result2);


        System.out.print("Enter double a : ");
        double doubleAA = input.nextDouble();
        System.out.print("Enter int b : ");
        int intBB = input.nextInt();
        double result3 = ex1.sum(doubleAA,intBB);       //  one double and one int
        System.out.println("Result 3: " + result3);
    }
}