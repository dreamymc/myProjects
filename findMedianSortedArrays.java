
import java.util.ArrayList;
import java.util.Collections;

public class findMedianSortedArrays {

    public static void main(String[] ukiyo) {
        int[] nums1 = {1, 3};
        int[] nums2 = {3};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList arraySum = new ArrayList<>();
        for (int x = 0; x < nums1.length; x++) {
            arraySum.add(nums1[x]);
        }
        for (int y = 0; y < nums2.length; y++) {
            arraySum.add(nums2[y]);
        }
        Collections.sort(arraySum);
        Integer[] array = (Integer[]) arraySum.toArray(new Integer[arraySum.size()]);
        int n = array.length;
        double dave = 0;
        if (n % 2 == 1) {
            double bitch = (n / 2);
            dave = array[(int) Math.round(bitch)];
        } else {
            int middle1 = n / 2 - 1;
            int middle2 = n / 2;
            return ((array[middle1] + array[middle2]) / 2.0);
        }
        return dave;
    }
}
