package Chapter5Exercises;
/**
 * @class: RectangleSize
 *@author: Karen Armendariz
 *@version: 1.0
 *@written on: October 9, 2023
 *@Course: ITEC 2140, Section 13
 *description: This program will accept a user input
 * return the size of a rectangle.
 */
import java.util.Scanner;

public class RectangleSize
{
    int height;         //instance variable height for the Class RectangleSize.
    int width;           //instance variable width for the class RectangleSize.

    public void rectangleHW()  //method rectangleHW is declared, initializes height and width variables.
    {
        Scanner input = new Scanner(System.in);  //input is created as object of Scanner class.
        System.out.println("Enter rectangle height: "); //user prompt to enter height
        height = input.nextInt(); //user input is assigned to "height" variable
        System.out.println("Enter rectangle width: "); //user prompt to enter width
        width = input.nextInt();  // user input is assigned to "width" variable
    }
    public int calculateArea()
    {
        return height * width;    // area is calculated using height and width variables.
    }
    public boolean isLarge(int area) // isLarge parameter of the int area is >300.
    {
        return area > 300; //is area is >300 , then true
    }
    public void printS(boolean isLarge) // method islarge value is then used to print if rectangle is large or not.
    {
        if(isLarge)
        {
            System.out.println("This is a large rectangle.");  //display if area>300, if true
        }
        else
        {
            System.out.println("This is a small rectangle.");    //display if area<300, if false
        }
    }
    public static void main(String[] args) //main method
    {
        RectangleSize recsize = new RectangleSize();    // recsize is the ofject of RectangleSize class
        recsize.rectangleHW();                           //rectangleHW method called.
        int area = recsize.calculateArea();              //calculation of the area using claculateArea method.
        boolean large = recsize.isLarge(area);            //isLarge method determines if area is large or not by passing
                                                           // area as a parameter to the isLarge method. returns true if >300.
        recsize.printS(large);                          //printS method called, passes "large" bool as parameter.
    }
}
