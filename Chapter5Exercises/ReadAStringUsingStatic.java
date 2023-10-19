package Chapter5Exercises;

import java.util.Scanner;
public class ReadAStringUsingStatic
{
    public static String readstring(Scanner sc)
    {
        System.out.println("Please enter a string: ");
        String inputStr = sc.nextLine();
        return inputStr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputStr = ReadAStringUsingStatic.readstring(sc);
        System.out.println("You entered:  "  +inputStr);
    }
}
