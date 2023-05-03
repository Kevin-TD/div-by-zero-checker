import org.checkerframework.checker.dividebyzero.qual.*;

public class test03 {
    public static void m() {
        int a = 0;
        int b = 0;
        int c = (a == b) ? 1 : 0;
        int d = b / c;
        int e = 1 / 1;
        e = d / d; // divide by zero
    }
    
}
