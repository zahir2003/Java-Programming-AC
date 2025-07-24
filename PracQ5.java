import java.util.Scanner;
class D 
{
    void vote()
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        age = sc.nextInt();
        if(age >= 18)
        {
            System.out.print("Eligible for vote");
        }
        else
        {
            System.out.print("Not eligible for vote");
        }

    }

}
public class PracQ5 {
    public static void main(String [] args)
    {
        D obj = new D();
        obj.vote();

    }
}
