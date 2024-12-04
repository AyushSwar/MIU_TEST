package B;

/*
1. A primeProduct is a positive integer that is the product of exactly two primes greater than 1.
For example, 22 is primeProduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
Write a function named isPrimeProduct  with an integer parameter that returns 1 if the parameter is a primeproduct, otherwise it returns 0.
Recall that a prime number is a positive integer with no factors other than 1 and itself.

You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime number.
You do not need to write isPrime. You are allowed to use this function.

The function signature
   int isPrimeProduct(int n)
*/
public class primeProduct {
    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(49));
    }

    public static int isPrimeProduct(int n) {
      if(n <= 1) return 0;

      for(int i=2; i*i <= n; i++){
          // Check if i is a factor of n
          if(n % i == 0) {
              // If n is divisible by i, check if the quotient is prime
              int quotient = n / i;
              if (isPrime(i) == 1 && isPrime(quotient) == 1 && i != quotient) {
                  return 1;
              }
          }
      }
      return 0;
    }

    public static int isPrime(int n) {
        if (n <= 1) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;  // n is divisible by i, so it's not prime
            }
        }
        return 1;  // n is prime
    }
}
/*
Time Complexity: 0(n)

Space Complexity: 0(1)
*/