import java.util.*;
public class hollowrectangle {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        //outer loop
        for (int i = 1; i <= r; i++){
            // inner loop
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c){
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
