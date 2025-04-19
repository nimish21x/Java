
import java.util.*;
public class GreaterNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Both numbers are equal");
        }
        else if (a>b){
            System.out.println("The first number is greater than second number");
        }
        else {
            System.out.println("The second number is greater than first number");
        }
    }
}
