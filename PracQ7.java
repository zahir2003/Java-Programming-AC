import java.util.Scanner;
class C
{
    void Number()
    {
        int num;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = a.nextInt();
        if(num == 0)
        {
            System.out.print("Entering number is zero");
        }
        else if(num > 0)
        {
            System.out.print("Entering number is positive");
        }
        else 
        {
            System.out.print("Entering number is negetive");
        }
    }
}
public class PracQ7 
{
    public static void main(String []args)
    {
        C obj = new C();
        obj.Number();
    }
}
