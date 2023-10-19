package Chapter5Exercises;

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

    public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
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
