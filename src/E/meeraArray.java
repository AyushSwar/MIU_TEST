package E;

public class meeraArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, -2};
        int[] arr2 = {8, 3, 4};

        System.out.println(isMeera(arr1)); // Output: 1
        System.out.println(isMeera(arr2)); // Output: 0
    }

    public static int isMeera(int[] a) {
        for (int n : a) {
            for (int m : a) {
                if (2 * n == m) {
                    return 0; // Found 2 * n in the array
                }
            }
        }
        return 1; // No 2 * n found in the array
    }
}

/* Complexity
Time Complexity: 𝑂 ( 𝑛 2 )
 -Two nested loops over the array.
Space Complexity: 𝑂 ( 1 )
-No extra space used.
*/