package C;

public class hollowArray {
    public static void main (String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 4, 0, 0, 0, 3, 4, 5})); // 1
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));    // 0
        System.out.println(isHollow(new int[]{1, 2, 4, 9, 0, 0, 0, 3, 4, 5})); // 0
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));           // 0
    }

    public static int isHollow(int[] a) {
        int startCount = 0, endCount = 0, middleZeroes = 0;

        int i = 0;
        // Step 1: Count from start non-zero elements
        while (i < a.length && a[i] != 0) {
            startCount++;
            i++;
        }

        // Step 2: Count middle zeroes
        while (i < a.length && a[i] == 0) {
            middleZeroes++;
            i++;
        }

        // Step 1: Count from end non-zero elements
        while (i < a.length && a[i] != 0) {
            endCount++;
            i++;
        }
        System.out.println(i + "e");

        System.out.println(endCount +"end");


        // Step 4: Check if the entire array is traversed and conditions are met
        if(i == a.length && startCount == endCount && middleZeroes <= 3) {
            return 1;
        }
        return 0;
    }

}

/*
Time Complexity: O(n) — Linear, as the array is traversed once.
Space Complexity: O(1) — Constant, as no additional data structures are used.


Find leading non-zero elements (count before the first zero).
Find trailing non-zero elements (count after the last zero).
Count middle zeroes (count between the leading and trailing sections).
Check conditions:

At least 3 zeroes in the middle.
The number of leading and trailing non-zero elements must be equal.
*/