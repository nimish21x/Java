import java.util.*;
public class sumFunction {
    public static int sum (int a, int b){
        int sum = a + b;
        System.out.printf("The calculated sum is %d", sum);
        return sum;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum (a, b);
    }
}
