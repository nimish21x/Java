// Take a matrix as input from the user. Search for a given number x and print the indices at ehich it occur.

import java.util.*;
public class Searching {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int r = sc.nextInt(); 
        int c = sc.nextInt();

        int Arr[][] = new int[r][c];

        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                Arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered Array is:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the element you want to search:");
        int x = sc.nextInt();

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
            if (Arr[i][j] == x){
                System.out.printf("The entered element is found at (%d, %d)", i, j);
            }
            }
        }
    }
}
