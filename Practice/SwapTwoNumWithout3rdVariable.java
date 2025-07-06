// Swap Two Numbers Without Using Third Variable
import java.util.Scanner;
public class SwapTwoNumWithout3rdVariable {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swapping without third variable
        a = a + b;  // a becomes 15 (5 + 10)
        b = a - b;  // b becomes 5 (15 - 10)
        a = a - b;  // a becomes 10 (15 - 5)

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
