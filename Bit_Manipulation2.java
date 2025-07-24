// SET BIT : 
// Set the 2nd bit(position = 1) of a number n.(n=0101)->5
// Bit Mask : 1<<1 (0001<<1)=0010
// Operation : OR (0010 | 0101)=0111->7.

public class Bit_Manipulation2 {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int bitmask = 1<<pos;
        int newNumber = (bitmask | n);
        System.out.println(newNumber);
    }
}
