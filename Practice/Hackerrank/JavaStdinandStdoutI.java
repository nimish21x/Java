/*
Task:
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line.  

Source: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=false
*/

import java.util.*;
public class  JavaStdinandStdoutI  {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}