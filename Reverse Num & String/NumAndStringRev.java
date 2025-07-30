public class Main {
    public static void main(String[] args) {
        // String numStr = "1234";
        String numStr = "Raja Kumar";


        // Method 1: Manual reverse
        String reversed = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversed += numStr.charAt(i);
        }

        System.out.println("Reversed String Number: " + reversed); // Output: 4321
    }
}
