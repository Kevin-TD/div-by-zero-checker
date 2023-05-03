import org.checkerframework.checker.dividebyzero.qual.*;
import java.util.Scanner;

public class test08 {
    public static void m() {
        Scanner s = new Scanner(System.in);
        int in = s.next().charAt(0);
        int a = 10;
        int b = 2;

        if (in > 0) {
            b = 0;
        } else if (in == 0) {
            b = 2 - b;
        } else {
            b = -2 + b;
        }

        int out = a / b; // potential div zero 

    }
    
}
