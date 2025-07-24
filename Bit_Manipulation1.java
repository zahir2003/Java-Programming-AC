// GET BIT :
// Get the 3rd bit (position = 2) of a number n. (n = 0101)
// Bit Mask : 1<<2 (ooo1<<2)=0100 , 1<<3 (0001<<3)=1000
// Operation : AND (0100 & 0101)=0001 , (1000 & 0101)=0000

public class Bit_Manipulation1 {
    public static void main(String[] args) {
        int n = 5; // n = 0101
        int pos = 2;
        int bitmask = 1<<pos;
        if((bitmask & n) == 0) // bitmask :(0100 & 0101) = 0100 so,it is one for position 2. For position 3 , bitmask : (1000 & 0101) = 0000 so, it is zero.
        { 
            System.out.println("Bit was zero");
        }
        else
        System.out.println("Bit was one");
        
    }
}
