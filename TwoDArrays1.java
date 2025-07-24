import java.util.*;
public class TwoDArrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size : ");
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
        System.out.println("The output is : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}