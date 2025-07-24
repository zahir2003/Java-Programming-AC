// Q.1) Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;
public class TwoDArrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size : ");
        int rows = sc.nextInt();
        System.out.print("Enter column size : ");
        int columns = sc.nextInt();
        int numbers[][] = new int[rows][columns];
        System.out.println("Enter the values : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the value,you want to search : ");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(numbers[i][j] == x)
                {
                    System.out.println(x+" is found at location : ("+i+","+j+")");
                }
            }
        }
    }
}
