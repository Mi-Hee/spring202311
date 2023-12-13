package exam01;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int[] nums2 = Arrays.stream(nums1).map(x -> x * x).toArray();
        int[] nums2 = Arrays.stream(nums1).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return 0;
            }
        }).toArray();

        System.out.println(Arrays.toString(nums2));

    }
}
