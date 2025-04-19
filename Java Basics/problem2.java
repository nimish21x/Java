/* Write a program to calculate percentage of 5 subjects. Marks sould be taken 
form user out of hundred */

import java.util.*;

public class problem2 {
    public static void main(String [] args)    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks in Subject 1:");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks in Subject 2:");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks in Subject 3:");
        int sub3 = sc.nextInt();
        System.out.println("Enter the marks in Subject 4:");
        int sub4 = sc.nextInt();
        System.out.println("Enter the marks in Subject 5:");
        int sub5 = sc.nextInt();
    
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        float average = sum*100/500;

        System.out.println("The percentage of marks in: " +average);
    }
}
