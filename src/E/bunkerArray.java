package E;

public class bunkerArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 6, 7, 3};
        int[] arr2 = {4, 9, 6, 15, 21};
        int[] arr3 = {1, 2};
        int[] arr4 = {4, 6, 8};

        System.out.println(isBunkerArray(arr1)); // Output: 1
        System.out.println(isBunkerArray(arr2)); // Output: 0
        System.out.println(isBunkerArray(arr3)); // Output: 1
        System.out.println(isBunkerArray(arr4)); // Output: 0
    }
    public static int isBunkerArray(int [] a) {
        for (int i=0; i<a.length-1; i++) {
            if(a[i] % 2 != 0 && isPrime(a[i+1]) == 1) {
                    return 1;
            }
        }
        return 0;
    }

    public static int isPrime(int a){
        if (a < 2) return 0;
        for(int i=2; i*i<=a; i++) {
            if(a%i == 0) {
                return 0;
            }
        }
        return 1;
    }

}
