public class Voideg {
    // Void method to add two numbers and print the result
    public static int addNumbers(int a, int b) {
        int sum = a + b; // Adding two numbers
        return sum;
    }
    

    public static void main(String[] args) {
        int total = addNumbers(5, 10); // Calling the method with 5 and 10
        System.out.println("The sum is: " + total); // Printing the result
    }
}
