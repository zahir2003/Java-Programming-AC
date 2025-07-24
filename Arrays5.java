// Q.2) Take an array of names as input from the user and print them on the screen.

import java.util.*;
public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the name : ");
            names[i]=sc.next();
        }
        for(int i=0;i<names.length;i++)
        {
            System.out.println("The name is : "+names[i]);
        }
    }
}
