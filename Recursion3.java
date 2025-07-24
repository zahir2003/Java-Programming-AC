// Q.3) Print factorial of a number n.

public class Recursion3 {
    public static int calFactorial(int n) {
        if(n==0 || n==1)
        {
            return 1;
        }
        int fact = calFactorial(n-1);
        int fact1 = n*fact;
        return fact1;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calFactorial(n);
        System.out.println("The factorial number is : "+ans);
    }
}
