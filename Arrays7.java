//Take an array of numbers as input and check if it is an array sorted in ascending order or not. Eg : { 1, 2, 4, 7 } is sorted in ascending order. {3, 4, 6, 2} is not sorted in ascending order.

import java.util.*;
public class Arrays7 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size : ");
int size = sc.nextInt();
int numbers[] = new int[size];
//input
for(int i=0; i<size; i++) {
    System.out.print("Enter the value : ");
    numbers[i] = sc.nextInt();
}
boolean isAscending = true;
for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
    if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
    isAscending = false;
    }
    }
    if(isAscending) {
    System.out.println("The array is sorted in ascending order");
    } else {
    System.out.println("The array is not sorted in ascending order");
    }
    }
    }