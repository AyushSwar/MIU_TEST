package E;

public class countDigit {
    public static void main(String[] args) {
        System.out.println(countDigit(32121, 1)); // Output: 2
        System.out.println(countDigit(33331, 3)); // Output: 4
        System.out.println(countDigit(33331, 6)); // Output: 0
        System.out.println(countDigit(3, 3));     // Output: 1
        System.out.println(countDigit(-543, 3));  // Output: -1
    }
    public static int countDigit(int num, int digit) {
        if(num < 0 || digit < 0) return -1;
        int count = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            if(lastDigit == digit) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
