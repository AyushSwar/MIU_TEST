package G;

public class continuousFactored {
    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));   // Expected: 1
        System.out.println(isContinuousFactored(60));  // Expected: 1
        System.out.println(isContinuousFactored(90));  // Expected: 1
        System.out.println(isContinuousFactored(99));  // Expected: 0
        System.out.println(isContinuousFactored(2));   // Expected: 0
    }
    public static int isContinuousFactored(int n) {

        for(int start=2;start<=n/2;start++) {
            int product = 1;

            for(int i=start; product<n; i++) {
                product *= i;
                if (product == n) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
/*
Time Complexity:
Outer loop: Iterates from 2 to 𝑛 / 2 , so O(n).
Inner loop: Runs until the product exceeds 𝑛, worst-case O(log(n)).
Overall: O(n log n).
 */