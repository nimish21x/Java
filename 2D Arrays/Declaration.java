import java.util.*;

public class Declaration {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int Arr[][] = new int [r][c];

        // Input
        System.out.println("Enter the elements of array");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                Arr[i][j] = sc.nextInt();
            }
        }

        // Output
         System.out.println("The entered Array is:");
         for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
         }
    }
}