package G;

/*
Approach:
Identify Primes in the Array: For each number in the array, determine if it is a prime number using the isPrime method.
Check Twin Prime: If a number is a prime, calculate its potential twin primes (n+2 and n−2).
Check if either of these twin primes exists in the array.
Return Result: If all primes have a twin prime in the array, return 1. Otherwise, return 0.
 */
public class twinsArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 10, 27};
        System.out.println(isTwin(arr));
    }

    public static int isTwin(int[] a) {
        for (int i=0; i<a.length; i++){
           if(isPrime(a[i])== 1) {
               boolean hasTwin = false;
               for (int j=0; j<a.length; j++){
                   if(a[j] == a[i]+2 || a[j] == a[i]-2) {
                      hasTwin = true;
                      break;
                   }
               }
               if(!hasTwin){return 0;}
           }

        }
        return 1;
    }

    public static int isPrime(int n) {
        if(n<=1){ return 0; }

        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
