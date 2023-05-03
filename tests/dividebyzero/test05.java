import org.checkerframework.checker.dividebyzero.qual.*;

public class test05 {
    public static void m() {
        int x = 0;
        int y = 1;
        if (x != 0) {
            int z = y / x; // unreachable
            // * false positive 
        }
    }
    
}
