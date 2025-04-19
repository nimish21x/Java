// Print the sum of first n natural numbers.
import java.util.*;
public class Ques1 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number till which sum has to be printed:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        };
        System.out.printf("The sum of first %d natural numbers is %d.", n, sum);

    }
}
