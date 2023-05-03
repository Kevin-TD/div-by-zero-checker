import org.checkerframework.checker.dividebyzero.qual.*;
import java.util.Scanner;

public class test10 {
    public static void m() {
        Scanner s = new Scanner(System.in);
        int in = s.next().charAt(0);
        int a = 10;
        int b = 2;

        if (in > 0) {
            b = 100 + b;
        } else if (in == 0) {
            b = 1;
        } else {
            b = a + b;
        }

        int out = a / b; //* correctly says this is not div zero */


    }
    
}
