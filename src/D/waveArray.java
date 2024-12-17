package D;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {7, 11, 12, 1, 6};
        System.out.println(isWave(arr));
    }

    public static int isWave(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            // Check if two adjacent numbers have the same parity (both even or both odd)
            if((arr[i] % 2) == (arr[i+1] % 2)) {
                return 0;
            }
        }
        return 1;
    }
}
