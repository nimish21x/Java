
import java.util.*;

public class EvenOdd {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n%2==0 && n>0){
            System.out.println("The entered number is an Even number");
        }
        else{
            System.out.println("The entered number is an Odd number");
        }
    }
}
