package C;

//int[ ] fill(int[ ] arr, int k, int n)

public class Fill {
    public static void main(String[] args) {
        // Test cases
        int[] result1 = fills(new int[]{1, 2, 3, 5, 9, 12, -2, -1}, 3, 10);
        int[] result2 = fills(new int[]{4, 2, -3, 12}, 1, 5);
        int[] result3 = fills(new int[]{2, 6, 9, 0, -3}, 0, 4);

        // Printing the results
        System.out.println(java.util.Arrays.toString(result1)); // Expected: [1, 2, 3, 1, 2, 3, 1, 2, 3, 1]
        System.out.println(java.util.Arrays.toString(result2)); // Expected: [4, 4, 4, 4, 4]
        System.out.println(java.util.Arrays.toString(result3)); // Expected: null
    }

   public static int[] fills(int[] arr, int k, int n) {
        if(k <= 0 || n <= 0 || arr == null) { return null; }

        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++) {
            arr2[i] = arr[ i % k];
        }
        return arr2;
   }
}
