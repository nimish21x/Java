// Find the maximum & minimum number in an array of integers.

import java.util.*;
public class question02 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("The entered Array is");
        for (int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }
        
        
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < size; i++){

            if (numbers[i] > max ){
                max = numbers[i];
            }

            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println();
        System.out.println("The maximum number in this array is " + max);
        System.out.println("The minimum number in this array is " + min);
    }
}
