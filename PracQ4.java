import java.util.Scanner;
class B
{
    void circumference()
    {
        float r;
        float sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        r = sc.nextFloat();
        sum = (22/7)*(r*r);
        System.out.print("Circumference of circle is : "+sum);
    }
}

public class PracQ4 {
    public static void main(String [] args)
    {
        B obj = new B();
        obj.circumference();

    }
}
