import java.util.*;
public class JavaLoopsI {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N >= 2 && N <= 20){
            for (int i = 1; i <= 10; i++){
                int result = N*i;
                System.out.println(N + " x " + i + " = " + result);
            }
        }
    }
}
