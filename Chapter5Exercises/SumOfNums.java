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
    public int sum(int num1, int num2) //method sum with parameters int num1 and int num2.
    {
        int answer = num1 + num2; // parameters are added and the answer is stored in answer variable
        return answer;

    }
    public static void main(String[] args) //main method
    {
        SumOfNums newSum = new SumOfNums(); //SumOfNums class - object created (newSum), allows method defined in
                                            //SumOfNums class to be called.

        Scanner input = new Scanner(System.in); //input instance created in Scanner class to read keyboard input.
        System.out.print("Enter integer 1: "); //user prompt
        int num1 = input.nextInt(); //num1 object is assigned the input value from the user input.

        Scanner input2 = new Scanner(System.in); // input2 instance is created in Scanner class to read keyboard input
        System.out.print("Enter integer 2: "); //user prompt
        int num2 = input2.nextInt(); //num2 instance is assigned the input value from the user

        int sumNum = newSum.sum(num1,num2); // num1 and num2 are arguments of the sum method. sum of the arguments is
                                            //calculated and then stored in sumNum variable.

        System.out.print("The sum of num1 and num2 is "  +sumNum); //displays the result of sumNum calculation.
    }
}
