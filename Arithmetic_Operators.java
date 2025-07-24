
// OPERATORS : Symbols that tell compiler to perform some opeation.

class Arithmetic_Operators
{
    public static void main(String[] args) {
         
        // Post Increment

        int a =10;
        int b = a++;
        int e = 15;
        int f = e--;
        System.out.println("A = "+a); 
        System.out.println("B = "+b);
        System.out.println("E = "+e);
        System.out.println("F = "+f);

        // Pre Increment

        int c = 25;
        int d = ++c;
        int g = 20;
        int h = --g;
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        System.out.println("G = "+g);
        System.out.println("H = "+h);
    }
}
