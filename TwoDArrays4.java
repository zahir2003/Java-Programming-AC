
// Q.2) For a given matrix of N x M, print its transpose.

import java.util.*;
public class TwoDArrays4 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter row size : ");
int n = sc.nextInt();
System.out.print("Enter column size : ");
int m = sc.nextInt();
int matrix[][] = new int[n][m];
System.out.println("Enter the values : ");
for(int i=0; i<n; i++) {
for(int j=0; j<m; j++) {
matrix[i][j] = sc.nextInt();
}
}
System.out.println("The transpose is : ");
//To print transpose
for(int j=0; j<m ;j++) {
for(int i=0; i<n; i++) {
System.out.print(matrix[i][j]+" ");
}
System.out.println();
}
}
}