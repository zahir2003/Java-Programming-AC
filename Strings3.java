public class Strings3 {
    public static void main(String[] args) {
        String name1="Tony";
        String name2="Tony";
        // compareTo() : For comparing between the two strings value. 1) S1 > S2 = +ve value ,2) S1 == 0 ,3) S1 < S2 = -ve value  Example : hello > cello , hello < kello , 
       if(name1.compareTo(name2)==0)
        {
            System.out.println("Strings are equal");
        }
        else
        System.out.println("Strings are not equal");

        /*if(new String("Tony") == new String("Tony"))
        {
            System.out.println("Strings are equal");
        }
        else
        System.out.println("Strings are not equal");*/
    }
}