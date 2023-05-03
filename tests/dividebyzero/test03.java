import org.checkerframework.checker.dividebyzero.qual.*;

public class test03 {
    public static void m() {
        int a = 0;
        int b = 0;
        int c;
        if (a == b) {
            c = 5; 
        }
        else {
            c = 0; 
        }
        int d = b / c; // *not div by zero but says it is 
        // it does seem to do lub for me (?) 
        // in one branch c is zero, another c is nonzero, but at the end it says c is top. if it did lub it did it correctly 
        // main problem is that it's unable to conclude that since a == b is true, c = 5 and there wont be div by zero. it does lub, when it should not need to 
        

        int e = 1 / 1;
        e = d / d; // divide by zero
    }
    
}
