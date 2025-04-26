// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class question02 {
    public static int oddNumSum (int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum of the odd number till the entered number is " + sum);
        return sum;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which sum has to be calculated:");
        int n = sc.nextInt();
        oddNumSum(n);
    }
}
