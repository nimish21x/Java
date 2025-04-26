// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class question03 {
    public static void greaterNum(int a, int b){
        if (a>b){
            System.out.println("The greater number is " + a);
        } else if (a<b){
            System.out.println("The greater number is " + b);
        } else {
            System.out.println("Both the numbers are equal!");
        }

        return;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers from which greater number has to be returned:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNum(a, b);
    }
}
