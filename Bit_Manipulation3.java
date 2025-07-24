// CLEAR BIT :
// Clear the 3rd bit (position = 2) of a number n.(n = 0101)->5
// Bit Mask : 1<<2 (0001<<2)=0100
// Operation : AND with NOT  ~(0100)=1011 , (1011 & 0101)=0001


public class Bit_Manipulation3 {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);
        int newNumber = (notbitmask & n);
        System.out.println(newNumber);
    }
}
