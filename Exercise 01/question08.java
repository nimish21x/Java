/* 
 Two numbers are entered by the user, x and n.
 Write a function to find the value of one number raised to the power of another i.e. xn.
 */
import java.util.*;
public class question08 {
    public static int powerFn(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and n:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("The value of x^n is " + powerFn(x, n));
    }
}