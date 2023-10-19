package Chapter5Exercises;

import java.util.Scanner;

public class RectangleSize
{
    int height;
    int width;

    public void rectangleHW()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle height: ");
        int height = input.nextInt();
        System.out.println("Enter rectangle width: ");
        int width = input.nextInt();
    }
    public int calculateArea()
    {
        return height * width;
    }
    public boolean isLarge(int area)
    {
        return area > 300;
    }
    public void printSize(boolean isLarge)
    {
        if(isLarge)
        {
            System.out.println("This is a large rectangle.");
        }
        else
        {
            System.out.println("This is a small rectangle.");
        }
    }
    public static void main(String[] args){
        RectangleSize recsize = new RectangleSize();
        recsize.rectangleHW();
        int area = recsize.calculateArea();
        boolean large = recsize.isLarge(area);
        recsize.printSize(large);
    }
}
