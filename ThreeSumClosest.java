
import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        ThreeSumClosest solution = new ThreeSumClosest();
        int[] nums = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target = -2;
        int result = solution.threeSumClosest(nums, target);
        System.out.println("Closest sum to target: " + result);
    }
}
