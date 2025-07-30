public class Main {
    public static void FindingDigitInterger(String[] args) {
        int number = 11;
        int digits = countDigits(number);
        System.out.println("Number of digits: " + digits); // Output: 2
    }

    public static int countDigits(int num) {
        if (num == 0) return 1;
        num = Math.abs(num);
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
