import java.util.*;
public class lowerrighttriangle {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for triangle:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
