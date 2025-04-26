import java.util.*;
public class productFunction {
    public static float product (float a, float b){
        float product = a*b;
        System.out.printf("The calculated sum is %.2f", product);
        return product;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate product:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        product (a,b);
    }
}
