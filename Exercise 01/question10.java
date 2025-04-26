/* 
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it
 */
import java.util.*;
public class question10 {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");
        
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        
        printFibonacci(n);

        sc.close();
    }
}
