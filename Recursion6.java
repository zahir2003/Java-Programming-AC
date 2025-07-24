// Q.6) Print x^n (stack height = logn).

public class Recursion6 {
    public static int calPower(int x,int n) {
        if(n==0)
        {
            return 1;
        }
        // if n is even
        if(n%2==0)
        {
            return calPower(x, n/2) * calPower(x, n/2);
        }
        else { // n is odd
            return calPower(x, n/2) * calPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
