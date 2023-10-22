package Chapter5Exercises;
/**
 * @class: GetGameScores
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user input
 * of their game scores and their name.
 */
import java.util.Scanner;

public class GetGameScores
{
    private Scanner input; // private instance of the Scanner class, input is instance variable used to read user input.

    public GetGameScores()
    {
        input = new Scanner (System.in);  //input variable is initialized
    }
     public String enterName() // method enterName is used to get the players name
     {
        System.out.println("Enter your name: "); //user prompt
        return input.nextLine(); //method input reads entered name and returns it as string.
     }
     public int enterScore(String str) //method enterScore is used to get the high score
     {
         System.out.println("Enter the high score for " +str+ ":");
         return input.nextInt();
     }
     public void printScore(String str, int score) //name and score parameters (from above) are used to print score and name.
     {
         System.out.println("Name: " +str);
         System.out.println("High Score: " +score);
     }
     public static void main(String[] args) //main method
     {
        GetGameScores gamescores = new GetGameScores(); //instance gamescores is created to call methods

        while(true) //while loop
        {
            String str = gamescores.enterName(); //enterName method called to get name and assign to str variable
            if(str.isEmpty()) //checks if name entered by user
            {
                break; // if no name entered by user, then loop stops
            }
            int score = gamescores.enterScore(str); //enterScore method is called to get entered score and
                                                    //stores the score in variable score.
            gamescores.input.nextLine(); //input scanner object
        }
        System.out.println("Done");
     }
}
