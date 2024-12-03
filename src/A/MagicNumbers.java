public class Main {
    public static void main(String[] args) {
          int[] arr = {21, 3, 7, 9, 11, 4, 6};
        System.out.print(isMagicArray(arr));
    }
    
    public static int isMagicArray(int[] a) {
        int sum = 0;
        
        for(int i=0; i < a.length; i++) {
            if(a[0] == 0) return 0;
            if(isPrime(a[i])){
                sum += a[i];
            }
        }
        return (sum == a[0]) ?1 : 0;
    }
    
    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        
        for(int i=2; i*i <= num; i++) {
            if(num % i == 0) return false;   
        }
        return true;
    }
}

/*
Time Complexity: O(n * √m), where n is the number of elements in the array and m is the value of the largest number in the array.
Space Complexity: O(1), since the algorithm uses a constant amount of extra space.
*/
