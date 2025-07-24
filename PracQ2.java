import java.util.Scanner;

class C {
    void oddNumber() {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
             sum = sum+i;  
            }
        }
       System.out.println("The total sum of odd number is : "+sum);
    }
}

public class PracQ2 {
    public static void main(String [] args) {
        C obj = new C();
        obj.oddNumber();
    }
}
