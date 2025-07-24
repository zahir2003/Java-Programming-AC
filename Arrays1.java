import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int marks[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the subject marks : ");
            marks[i]=sc.nextInt();
            System.out.println("The marks are : "+marks[i]);
        }
    }
}
