package F;

public class meeraNumbers {
    public static void main(String[] args) {
        System.out.println(isMeera(6));   // Output: 1
        System.out.println(isMeera(30));  // Output: 1
        System.out.println(isMeera(21));  // Output: 0
        System.out.println(isMeera(1));   // Output: 0
        System.out.println(isMeera(10));  // Output: 0
    }

    public static int isMeera(int n) {
        if (n <= 1) return 0; // Numbers <= 1 are not Meera numbers

        int count = 0;

        // Find nontrivial factors
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Check if the count is a factor of n
        return (count > 0 && n % count == 0) ? 1 : 0;
    }
}
/*
Complexity Time Complexity: 𝑂 ( 𝑛 / 2 )
-Loops through half the numbers from 2 to n / 2 to find factors.
Space Complexity: 𝑂 ( 1 )
-Uses a single variable to count factors.
* */