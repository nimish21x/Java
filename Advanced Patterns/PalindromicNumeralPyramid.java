import java.util.*;
public class PalindromicNumeralPyramid {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for pyramid:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--){
                System.out.printf("%d", j);
            }
            for (int j = 2; j <= i; j++){
                System.out.printf("%d", j);
            }
        System.out.println();
        }
    }
}
