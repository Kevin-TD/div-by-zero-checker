import org.checkerframework.checker.dividebyzero.qual.*;

public class test04 {
    public static void m() {
        int x = 0;
        int y = 2;
        int z;
        if (x < 1) {
            z = y / x; // divide-by-zero within branch
        }
    }
    
}
