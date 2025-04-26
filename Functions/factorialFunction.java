import java.util.*;
public class factorialFunction {
    public static void factorial (int n){
        if (n<0){
            System.out.println("Invalid Input!");
        return;
    }
    int factorial = 1;
    
    for (int i = n; i >= 1; i--){
        factorial = factorial * i;
    }

    System.out.printf("The factorial of entered number is %d", factorial);
    return;
    
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial:");
        int n = sc.nextInt();
        factorial (n);
    }
}
