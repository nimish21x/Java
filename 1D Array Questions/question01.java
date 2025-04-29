// Take an array of names as input from the user and print them on the screen

import java.util.*;
public class question01{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of String:");
        int size = sc.nextInt();
        
        String name[] = new String[size];
        System.out.println("Enter the Elements of String name:");
        for (int i = 0; i < size; i++){
            name[i] = sc.next();
        }
        
        System.out.println("The entered String is");
        for (int i = 0; i < size; i++){
            System.out.print(name[i] + " ");
        }
    }
}