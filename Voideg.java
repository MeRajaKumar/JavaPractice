public class VoidEG {
    // Void method to add two numbers and print the result
    public static int addNumbers(int a, int b) {
        int sum = a + b; 
        return sum;
    }
    public static void main(String[] args) {
        int total = addNumbers(5, 10); 
        System.out.println("The sum is: " + total); 
    }
}
