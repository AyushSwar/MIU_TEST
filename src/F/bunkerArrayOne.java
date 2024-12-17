package F;

public class bunkerArrayOne {
    public static void main(String[] args) {
        int[] arr = {8, 6, 10, 1};
        System.out.println(isBunker(arr));
    }

    public static int isBunker(int[] a) {
        boolean countPrime = false;
        boolean countOne = false;

        for(int n : a){
            if(isPrime(n) == 1){
                countPrime = true;
            }
            if(n == 1){
                countOne = true;
            }
        }

        // Return 1 if both conditions are satisfied, otherwise return 0
        if (countOne && countPrime) {
            return 1;
        }

        return 0;
    }

    public static int isPrime(int n) {
        if (n <= 1) {
            return 0;  // Not prime if <= 1
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;  // Not prime if divisible by any number other than 1 and itself
            }
        }
        return 1;  // Prime
    }
}
