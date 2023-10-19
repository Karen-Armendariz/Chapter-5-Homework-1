package Chapter5Exercises;

import java.util.Scanner;

/**
 * @class: SumOfNums
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 15, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will return the sum of two numbers
 *
 */
public class SumOfNums
{
    public int sum(int num1, int num2)
    {
        int answer = num1 + num2;
        return answer;

    }
    public static void main(String[] args)
    {
        SumOfNums newSum = new SumOfNums();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        int num1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter integer 2: ");
        int num2 = input2.nextInt();

        int sumNum = newSum.sum(num1,num2);

        System.out.print("The sum of num1 and num2 is "  +sumNum);
    }
}
