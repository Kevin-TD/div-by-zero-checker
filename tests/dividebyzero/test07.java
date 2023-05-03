import org.checkerframework.checker.dividebyzero.qual.*;
import java.util.Scanner;

public class test07 {
    public static void m() {
        Scanner s = new Scanner(System.in);
        int x = s.next().charAt(0);
        int y = 0;
        if (x > 10) {
            y = 1;
        } else {
            y = 2;
        }
        int z = x / y;
        // *correctly says theres no errors but im not sure how it actually got it right. i did not implement lub usage ey. 
    }
    
}
