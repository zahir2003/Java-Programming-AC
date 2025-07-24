import java.util.Scanner;

public class Arrays3 {
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
        for(int i=0;i<size;i++)
        {
            System.out.println("The output is : "+numbers[i]);
        }
        }
    }

