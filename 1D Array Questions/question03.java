// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;

public class question03 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int Array[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++){
            Array[i] = sc.nextInt();
        }

        System.out.println("The entered Array is:");
        for (int i = 0; i < size; i++){
            System.out.println(Array[i] + " ");
        }

        Boolean isAscending = true;
        for (int i = 0; i < size - 1; i++) {
            if (Array[i] > Array[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted in ascending order.");
        }
    }
}
