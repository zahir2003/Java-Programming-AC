// UPDATE BIT :
// Update the 2nd bit (position = 1) of a number n to 0 and 1.(n = 0101)->5
// 1) For 0 : 
   // Bit Mask : 1<<1 (0001<<1)=0010
  // Operation : AND with NOT  ~(0010)=1101 , (1101 & 0101)=0101->5
// 2) For 1 :
   // Bit Mask : 1<<1 (0001<<1)=0010
   // Operation : OR  (0010 | 0101)=0111->7

import java.util.*;
public class Bit_Manipulation4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for set operation and enter 0 for clear operation : ");
        int oper = sc.nextInt();
        int n = 5; //0101
        int pos = 1;
        int bitmask = 1<< pos;
        if(oper == 1) {
            int newnumber = (bitmask | n);
            System.out.println(newnumber);
        }
        else if(oper == 0) {
            int newbitmask = ~(bitmask);
            int newnumber2 = (newbitmask & n);
            System.out.println(newnumber2);
        }
        else {
            System.out.println("Please select either 0 or 1 !!");
        } 
    }
}
