
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findClosestNumber {

    public static void main(String[] ukiyo) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));

    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        List numbers = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i] + nums[i + 1] + nums[i + 2];
            numbers.add(sum);
        }
        return findClosestNumber(numbers, target);
    }

    public static int findClosestNumber(List<Integer> numbers, int target) {
        int closestNumber = numbers.get(0);
        int minDifference = Math.abs(target - closestNumber);
        for (int number : numbers) {
            int difference = Math.abs(target - number);
            if (difference < minDifference) {
                minDifference = difference;
                closestNumber = number;
            }
        }
        return closestNumber;
    }
}
