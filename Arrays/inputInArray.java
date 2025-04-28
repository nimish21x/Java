import java.util.*;
public class inputInArray {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        int numberArr[] = new int[size];

        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < size; i++){
            numberArr[i] = sc.nextInt();
        }

        System.out.println("The entered Array is:");
        for (int i = 0; i < size; i++){
            System.out.print(numberArr[i] + " ");
        }

        sc.close();
    }
}
