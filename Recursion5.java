// Q.5) Print x^n(stack height = n).

public class Recursion5 {
    public static int calPower(int x, int n) {
        if(n==0) // base case 
        {
            return 1;
        }
        int a = calPower(x, n-1); // Actual work
        int b = x*a;
        return b;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
