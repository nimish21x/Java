// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class question05 {
    public static void ageEligiblity(int a){
        if (a >= 18){
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
        return;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int a = sc.nextInt();
        ageEligiblity(a);
    }
}