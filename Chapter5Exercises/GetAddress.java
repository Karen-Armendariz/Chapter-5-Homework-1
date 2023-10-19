package Chapter5Exercises;

import java.util.Scanner;

public class GetAddress
{
    private Scanner input;
    public String nameAddress()
    {
        System.out.println("Enter name and address: ");
        String str = input.nextLine();
        return str;
    }
    public String cityState()
    {
        System.out.println("Enter city and state: ");
        String str1 = input.nextLine();
        return str1;
    }
    public static void main(String[] args)
    {
        GetAddress ga1 = new GetAddress();
        ga1.input = new Scanner(System.in);
        String nameAddressinput = ga1.nameAddress();
        String cityStateinput = ga1.cityState();
        System.out.println("Name and Address: " +nameAddressinput);
        System.out.println("City and State: " +cityStateinput);
    }
}