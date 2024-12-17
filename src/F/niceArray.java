package F;

public class niceArray {
    public static void main(String[] args) {
        int[] arr = {2, 10, 9, 3};
        System.out.println(isNice(arr));  // Expected output: 1

        int[] arr2 = {3, 4, 5, 7};
        System.out.println(isNice(arr2));  // Expected output: 0
    }

    public static int isNice(int[] a) {
        // Loop through each element in the array
        for (int n : a) {
            boolean found = false;
            // Check if n-1 or n+1 is in the array
            for (int m : a) {
                if (m == n - 1 || m == n + 1) {
                    found = true;
                    break;
                }
            }
            // If neither n-1 nor n+1 is found, return 0 (not a Nice array)
            if (!found) {
                return 0;
            }
        }
        // If all elements satisfy the condition, return 1 (Nice array)
        return 1;
    }
}
