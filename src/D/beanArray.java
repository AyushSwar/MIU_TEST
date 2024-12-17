package D;

public class beanArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 9, 6, 13};
        int[] arr2 = {4, 7, 16};
        int[] arr3 = {3, 4, 6, 7, 13, 15};
        int[] arr4 = {9, 6, 18};

        System.out.println(isBean(arr1)); // Output: 1
        System.out.println(isBean(arr2)); // Output: 0
        System.out.println(isBean(arr3)); // Output: 1
        System.out.println(isBean(arr4)); // Output: 0
    }

    public static int isBean(int[] arr) {
        boolean has9 = false, has13 = false, has7 = false, has16 = false;

        for (int num : arr) {
            if (num == 9) {has9 = true;}
            if (num == 13) {has13 = true;}
            if (num == 7) {has7 = true;}
            if (num == 16) {has16 = true;}
        }

        // Condition (a): If the array contains 9, it must also contain 13
        if(has9 && !has13) {
            return 0;
        }

        // Condition (b): If the array contains 7, it must not contain 16
        if(has7 && has16) {
            return 0;
        }

        return 1;
    }
}
