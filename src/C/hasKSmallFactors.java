package C;

public class hasKSmallFactors {
    public static void main(String[] args) {
        System.out.println(hasKSmallFactor(7, 30)); // true
        System.out.println(hasKSmallFactor(6, 14)); // false
        System.out.println(hasKSmallFactor(6, 30)); // false
    }

    public static boolean hasKSmallFactor(int k, int n) {
        if(k <= 0 || n <= 0) return false;

        for(int u=1; u < k && u*u <= n; u++) {
            if(n % u == 0) {
                int v = n / u;
                {
                    if (v < k) return true;
                }
            }
        }
        return false;
    }
}
