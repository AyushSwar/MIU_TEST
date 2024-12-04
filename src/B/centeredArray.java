package B;

/*
3. An array with an odd number of elements is said to be centered if all elements
(except the middle one) are strictly greater than the value of the middle element.
Note that only arrays with an odd number of elements have a middle element.
Write a function named isCentered that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.

Examples: {5, 3, 3, 4, 5} is not a centered array (the middle element 3 is not strictly less than all other elements),
{3, 2, 1, 4, 5} is centered (the middle element 1 is strictly less than all other elements),
{3, 2, 1, 4, 1} is not centered (the middle element 1 is not strictly less than all other elements),
{3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even numbers of elements),
{} is not centered (no middle element), {1} is centered (satisfies the condition vacuously).

*/
public class centeredArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        System.out.println(isCentered(arr));
    }

    public static int isCentered(int[] arr) {

        // Check for even number of elements or empty array
        if (arr.length % 2 == 0 || arr.length == 0) {
            return 0;
        }

        int midElement = arr.length / 2; // Middle element index
        int midValue = arr[midElement];

        for(int i = 0; i < arr.length; i++) {
                if(i != midElement && arr[i] <= midValue) {
                    return 0;
                }

        }
        return 1;
    }
}
