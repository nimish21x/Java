/*
 Task - 
 In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the 
 instructions in the Output Format section below.
 

 Source - https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 */

import java.util.*;
public class JavaStdinandStdoutII {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);

        sc.close();
    }
}
