import java.util.Scanner;

import org.checkerframework.checker.dividebyzero.qual.*;
import java.util.Scanner;

public class test12 {
    public static void m() {
        Scanner s = new Scanner(System.in);

        int i = s.next().charAt(0);
        int sum = 0;
        while (sum < 50) {
            sum += i;
        }
        int y = sum - 55;
        int z = i / y; //* potential div zero */

    }
    
}
