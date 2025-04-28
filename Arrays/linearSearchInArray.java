import java.util.*;
public class linearSearchInArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        int Arr[] = new int[size];
        
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < size; i++){
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search:");
        int elt = sc.nextInt();

        for (int i = 0; i < size; i++){
            if (Arr[i] == elt){
                System.out.println("The number is found at index value of " + i);
            }
        }
    }
}
