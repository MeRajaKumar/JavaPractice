import java.util.*;

public class DataTypeExample {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int a;
        float b;
        char c = 'x'; // Default char
        double d;
        long l;
        byte byt;
        short sht;
        String str;

        System.out.print("Enter Int value: ");
        a = ob.nextInt();

        System.out.print("Enter Float value: ");
        b = ob.nextFloat();

        System.out.print("Enter Double value: ");
        d = ob.nextDouble();

        System.out.print("Enter Long value: ");
        l = ob.nextLong();

        System.out.print("Enter Byte value: ");
        byt = ob.nextByte();

        System.out.print("Enter Short value: ");
        sht = ob.nextShort();

        ob.nextLine(); // Consume leftover newline
        System.out.print("Enter String: ");
        str = ob.nextLine();

        // Output
        System.out.println("\n--- Output ---");
        System.out.println("Int: " + a);
        System.out.println("Float: " + b);
        System.out.println("Char: " + c);
        System.out.println("Double: " + d);
        System.out.println("Long: " + l);
        System.out.println("Byte: " + byt);
        System.out.println("Short: " + sht);
        System.out.println("String: " + str);

        ob.close();
    }
}