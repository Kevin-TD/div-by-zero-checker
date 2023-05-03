import org.checkerframework.checker.dividebyzero.qual.*;

public class test01 {
    public static void m() {
        int a = 0;
        int b = 1;
        int c = a + 1;
        int d = b / a; // Divide by zero
        int test_compound = 5; 
        test_compound /= 0; // div by zero

        if (c > 0) {
            a = 1;
        }
    }
    
}
