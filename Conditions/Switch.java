import java.util.*;
public class Switch {
    public static void main (String [] srgs){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the button number");
        int button = sc.nextInt();

        switch (button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}
