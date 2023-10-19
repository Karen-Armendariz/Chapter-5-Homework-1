package Chapter5Exercises;

import java.util.Scanner;

public class GetGameScores
{
    private Scanner input;

    public GetGameScores()
    {
        input = new Scanner (System.in);
    }
     public String enterName()
     {
        System.out.println("Enter your name: ");
        return input.nextLine();
     }
     public int enterScore(String str)
     {
         System.out.println("Enter the high score for " +str+ ":");
         return input.nextInt();
     }
     public void printScore(String str, int score)
     {
         System.out.println("Name: " +str);
         System.out.println("High Score: " +score);
     }
     public static void main(String[] args)
     {
        GetGameScores gamescores = new GetGameScores();
        while(true){
            String str = gamescores.enterName();
            if(str.isEmpty())
            {
                break;
            }
            int score = gamescores.enterScore(str);
            gamescores.input.nextLine();
        }
        System.out.println("Done");
     }
}
