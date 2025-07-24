// Q.1) Take an array as input from the user .Search for a given number x and print the index at which it occours.

import java.util.*;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size =sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the value : ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the value that you want to search : ");
        int x = sc.nextInt();
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] == x)
            {
                System.out.println(x+" found at index : "+i);
            }
        }
        }
    }


