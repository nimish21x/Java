// Take input a & b form user and then print them using variable sum.


import java.util.*;
public class problem {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt(); 

        int sum = a + b;
        System.out.println(sum);
        

    }

}