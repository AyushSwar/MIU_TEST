package G;

/*
Key Idea:
We check if both arrays have the same unique elements, regardless of their order or repetition.

Steps:
Create two helper arrays (freqA and freqB) to count the occurrences of each number for both arrays.
Loop through each array to fill the helper arrays.
Compare the helper arrays to see if the frequencies match.
 */
public class setEqual {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 12};
        int[] arr2 = {12, 1, 9};

        System.out.println(isSetEqual(arr1, arr2)); // Output: 1
    }

    public static int isSetEqual(int[] a, int[] b) {
        int maxRange = 101;
        int[] freqA = new int[maxRange];
        int[] freqB = new int[maxRange];

        // Populate frequency arrays
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < maxRange) {
                freqA[a[i]]++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 0 && b[i] < maxRange) {
                freqB[b[i]]++;
            }
        }

        // Compare frequency arrays
        for (int i = 0; i < maxRange; i++) {
            if ((freqA[i] > 0 || freqB[i] > 0) && freqA[i] != freqB[i]) {
                return 0; // Arrays are not set equal
            }
        }

        return 1; // Arrays are set equal
    }
}
