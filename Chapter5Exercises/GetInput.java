package Chapter5Exercises;

import java.util.Scanner;

public class GetInput
{
    public void printString(String str) //printString method
    {
        System.out.println(str);
    }
    public String getInput()  // getInput method.   method for user string input.
    {
        Scanner sc = new Scanner(System.in);  //create Scanner object (sc).

        System.out.println("Enter a string: ");
        String userInput = sc.nextLine();  //user string stored in userInput var, type String.
        return userInput; //returns userInput string , from getInput method.
    }
    public static void main(String[] args) //main method.
    {
        GetInput strInput = new GetInput(); //create object of the GetInput class (strInput).
        String myString = strInput.getInput(); //call getInput method on object (strInput), stores string in myString
        strInput.printString("You entered: "  + myString); //call printString method on the object(strInput).
    }
}
