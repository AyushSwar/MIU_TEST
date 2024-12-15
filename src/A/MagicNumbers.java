package A;
/*
2. An array is defined to be a Magic array if the sum of the primes in the array is equal to the first element of the array.
If there are no primes in the array, the first element must be 0.
So {21, 3, 7, 9, 11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the first element of the array.
{13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13 which is also the first element.
Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}.
{8, 5, -5, 5, 3} is not a Magic array because the sum of the primes is 5+5+3 = 13.
Note that -5 is not a prime because prime numbers are positive.
*/

public class MagicNumbers {
    public static void main(String[] args) {
          int[] arr = {21, 3, 7, 9, 11, 4, 6};
        System.out.print(isMagicArray(arr));
    }
    
    public static int isMagicArray(int[] a) {
        int sum = 0;

        for (int numb : a) {
            if (a[0] == 0) return 0;
            if (isPrime(numb)== 1) {
                sum += numb;
            }
        }
        System.out.println(sum);
        return (sum == a[0]) ?1 : 0;
    }
    
    public static int isPrime(int num) {
        if(num <= 1) return 0;
        
        for(int i=2; i*i <= num; i++) {
            if(num % i == 0) return 0;
        }
        return 1;
    }
}

/*
Time Complexity: O(n * √m), where n is the number of elements in the array and m is the value of the largest number in the array.
Space Complexity: O(1), since the algorithm uses a constant amount of extra space.
*/
//
//public static int isMagicArray(int[] a) {
//    int sum = 0;
//
//    for(int i = 1; i < a.length; i++) {
//        if(isPrime(a[i]) == 1) {
//            sum += a[i];
//        }
//    }
//
//    System.out.println(sum);
//
//    return (sum == a[0]) ? 1 : 0;
//}
//
//public static int isPrime(int n) {
//    if (n <= 1 ) return 0;
//
//    for (int i=2; i*i <= n ; i++) {
//        if(n % i == 0) {
//            return 0;
//        }
//    }
//    return 1;
//}