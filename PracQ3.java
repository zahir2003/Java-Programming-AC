import java.util.Scanner;
class C
{
    void number()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        a = sc.nextInt();
        System.out.print("Enter b value : ");
        b = sc.nextInt();
        if(a>b)
        {
            System.out.print("A is greatest");
        }
        else
        {
            System.out.print("B is greatest");
        }

    }

}

public class PracQ3 {
    public static void main(String []args)
    {
        C obj=new C();
        obj.number();


    }
}
