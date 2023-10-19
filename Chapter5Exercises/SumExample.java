package Chapter5Exercises;

import java.util.Scanner;

public class SumExample
{
    public double sum(double a, double b)    // Method to sum two double values
    {
        System.out.println("double-double sum method");
        return a + b;
    }
    public double sum(int a, int b)     // Method to sum two int values
    {
        System.out.println("int-int sum method");
        return a + b;
    }
    public double sum(double a, int b)   // Method to sum a double and an int
    {
        System.out.println("double-int sum method");
        return a + b;
    }

    public static void main(String[] args)
    {
        SumExample ex1 = new SumExample();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter double a : ");
        double doubleA = input.nextDouble();
        System.out.print("Enter double b : ");
        double doubleB = input.nextDouble();
        double result1 = ex1.sum(doubleA,doubleB);     // two double values
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