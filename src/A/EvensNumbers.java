package A;

/*
An Evens number is an integer whose digits are all even. For example 2426 is an Evens number but 3224 is not.

Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it returns 0.

The function signature is
int isEvens (int n)
 */

public class EvensNumbers {
    public static void main(String[] args) {
        System.out.println(isEvens(2426)); // Output: 1
        System.out.println(isEvens(3224)); // Output: 0
        System.out.println(isEvens(-246)); // Output: 0
        System.out.println(isEvens(0));    // Output: 1
    }

    public static int isEvens(int n) {
        // Handle negative numbers; evens numbers must be non-negative.
        if (n < 0) return 0;

        // Check each digit of the number.
        while (n > 0) {
            int digit = n % 10; // Extract the last digit.
            if (digit % 2 != 0) { // Check if the digit is odd.
                return 0; // Return 0 if any digit is odd.
            }
            n /= 10; // Remove the last digit.
        }
        return 1; // Return 1 if all digits are even.
    }
}

/*
Complexity:
Time Complexity: 𝑂 ( 𝑑 ) O(d), where 𝑑 d is the number of digits in the input number.
                Linear Complexity in terms of the number of digits.

Space Complexity: 𝑂 ( 1 ) O(1), as no additional space is used.
                 The algorithm uses a fixed, constant amount of memory throughout its execution, so the space complexity is O(1).
*/

