import org.checkerframework.checker.dividebyzero.qual.*;
import java.util.Scanner;

public class test09 {
    public static void m() {
        Scanner s = new Scanner(System.in);
        int in = s.next().charAt(0);
        int a = 10;
        int b = 2;

        if (in > 0) {
            b = in + b;
        } else if (in == 0) {
            b = 0;
        } else {
            b = in - b;
        }

        int out = a / b;


    }
    
}
