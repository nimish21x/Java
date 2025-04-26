// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class question04 {
    public static float circumference (float r){
        float circumference = (2*3.14f)*r;
        System.out.println("The circumference of circle is " + circumference);
        return circumference;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        float r = sc.nextInt();
        circumference(r);
    }
}
