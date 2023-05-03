import org.checkerframework.checker.dividebyzero.qual.*;
import java.util.Scanner;

public class test06 {
    public static void m() {
        Scanner s = new Scanner(System.in);
        int x = s.next().charAt(0);
        int y = 2;
        if (x > 10) {
            y = 0;
        }
        int z = x / y; // divide-by-zero after branch
    }
    
}
