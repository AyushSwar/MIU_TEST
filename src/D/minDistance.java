package D;

public class minDistance {
    public static void main(String[] args) {
        System.out.println(minDistances(13013)); // Output: 2
    }

    public static int minDistances(int n) {
        int[] factors = new int[n]; // Array to store factors
        int factorCount = 0; // Count of factors found

        // Step 1: Find all factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[factorCount++] = i; // Store the factor
            }
        }

        // Step 2: Calculate minimum distance
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < factorCount; i++) { // Start from i = 1 to avoid out-of-bounds
            int distance = factors[i] - factors[i - 1]; // Difference between consecutive factors
            if (distance < minDistance) {
                minDistance = distance; // Update minimum distance
            }
        }

        return minDistance; // Return the smallest distance
    }
}
