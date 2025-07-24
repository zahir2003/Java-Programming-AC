// Q.1) Print numbers friom 5 to 1 and 1 to 5.

public class Recursion1 {
    public static void print(int n) {
        if(n == 0) // Base case
        {
            return;
        }
        System.out.println(n); // Recursion
        print(n-1);
    }

    public static void print2(int a) {
        if(a == 6)
        {
            return;
        }
        System.out.println(a);
        print2(a+1);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n); // n = 5
        int a = 1;
        print2(a);
    }
}
