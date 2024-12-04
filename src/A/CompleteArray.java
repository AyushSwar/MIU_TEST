package A;
/*

3. An array is defined to be complete if the conditions (a), (d) and (e) below hold.
  a. The array contains even numbers
  b. Let min be the smallest even number in the array.
  c. Let max be the largest even number in the array.
  d. min does not equal max
  e. All numbers between min and max are in the array.

*/
import java.util.*;

public class CompleteArray {
    public static void main(String[] args){
        int[] arr =  {-5, 6, 2, 3, 2, 4, 5, 12, 8, 7};
        System.out.println(isComplete(arr));
    }

    public static int isComplete(int[] arr){
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        Set<Integer> numbers = new HashSet<>();
        boolean hasEven = false;

        for(int num : arr) {
            numbers.add(num);
            if(num % 2 == 0) {
                hasEven = true;
                if(num < minValue) {
                    minValue = num;
                } else if(num > maxValue) {
                    maxValue = num;
                }
            }
        }
        System.out.println("max " + maxValue);
        System.out.println("min " +  minValue );

        // If there are no even numbers or min == max, return 0
        if (!hasEven || minValue == maxValue) return 0;

        for(int i=minValue; i <= maxValue; i++) {
           if (!numbers.contains(i)) return 0;
        }
        return 1;
    }
}

/*
Time Complexity: 0(n)
Space Complexity: 0(n)
for the HashSet.
*/