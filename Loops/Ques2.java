// Print the table of any number taken as input as user.

import java.util.*;
public class Ques2 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number whose number has to be printed:");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int m = n*i;
            System.out.printf("%d * %d = %d %n", n, i, m);
        }
    }
}
