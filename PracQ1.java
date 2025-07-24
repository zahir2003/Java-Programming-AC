import java.util.Scanner;
class A
{
    void average()
    {
        float a,b,c,avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        a = sc.nextFloat();
        System.out.print("Enter b value : ");
        b = sc.nextFloat();
        System.out.print("Enter c value : ");
        c = sc.nextFloat();
        avg = (a+b+c)/3;
        System.out.println("Average is : "+avg);
 
    }
}

class PracQ1
{
    public static void main(String [] args)
    {
        A obj = new A();
        obj.average();
    }
}