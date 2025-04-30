import java.util.*;
public class transposeOfMatrix {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int Matrix[][] = new int [r][c];
        int transposeOfMatrix[][] = new int [c][r];

        System.out.println("Enter the elements of Matrix:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++ ){
                Matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered Matrix is:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++ ){
            System.out.print(Matrix[i][j] + " ");    
            }
            System.out.println();
        }

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++ ){
                transposeOfMatrix[j][i] = Matrix[i][j];
            }
        }

        System.out.println("The transpose for the given matrix will be:");
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++ ){
                System.out.print(transposeOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
