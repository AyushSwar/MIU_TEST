package H;
/*
You need to generate the sequence starting from 1, and keep adding an increment that increases by 1 each time.
Stop once the current value in the sequence is greater than or equal to n. If you find n in the sequence, return 1; otherwise, return 0
 */
public class smartNumber {
    public static void main(String[] args) {
        System.out.println(isSmart(11)); // Output: 1
        System.out.println(isSmart(22)); // Output: 1
        System.out.println(isSmart(8));  // Output: 0
    }

    public static int isSmart(int n) {
        if (n <= 0) return 0; // Smart numbers are positive

        int current = 1; // First element of the sequence
        int increment = 1; // The amount to add for the next element

        while (current < n) { // Generate the sequence until current surpasses n
            current += increment; // Compute the next element in the sequence
            increment++; // Increase the increment for the next element
        }

        // If the sequence matches n, return 1; otherwise, return 0
        return (current == n) ? 1 : 0;
    }
}
