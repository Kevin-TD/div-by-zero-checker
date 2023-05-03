import org.checkerframework.checker.dividebyzero.qual.*;

public class test03 {
    public static void m() {
        int a = 0;
        int b = 0;
        int c;
        if (a == b) {
            c = 1; 
        }
        else {
            c = 0; 
        }
        int d = b / c; // *not div by zero but says it is 
        int e = 1 / 1;
        e = d / d; // divide by zero
    }
    
}
