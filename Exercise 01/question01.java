// Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class question01 {
    public static int average (int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.println("The average of entered number is " + average);
        return average;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to calculate average -");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a, b, c);
    }
}