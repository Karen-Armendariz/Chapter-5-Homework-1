package Chapter5Exercises;

import java.util.Scanner;

public class ReverseString
{
    public static String reverseString(String str)
    {
        String newStr = "";

        for (int i = str.length()-1; i >= 0; i--)
        {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args)
    {
        Scanner str2 = new Scanner(System.in);
        System.out.print("Enter a string   ");
        String input = str2.nextLine();
        String new2 = reverseString(input);

        System.out.print(new2);
    }
}
