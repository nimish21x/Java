import java.util.*;

public class solidrectangle {
    public static void main (String srgs []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++){
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}