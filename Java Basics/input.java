import java.util.*;
public class input {

    public static void main (String [] args) {
        System.out.println("Enter your name:");
        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //next() only takes one token 
        // nextLine() is used to take a complete oinput from the user.
        // nextInt() for integer input 
        // nextFloat() for FLoat input  
        System.out.println(name);
    }
};
