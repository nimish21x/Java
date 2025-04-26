import java.util.*;
public class nameFunction{
    public static void printMyName (String name){
        System.out.printf("The entered name is %s", name);
        return;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        printMyName(name);
    }
}