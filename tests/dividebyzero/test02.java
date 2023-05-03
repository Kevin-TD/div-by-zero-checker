import org.checkerframework.checker.dividebyzero.qual.*;
import java.util.Scanner;

public class test02 {
    public static void m() {
        Scanner s = new Scanner(System.in);
        int x = s.next().charAt(0);
        int y = 5 / x;
    }
    
}
