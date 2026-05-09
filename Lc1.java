
/**
 * https://leetcode.com/problems/two-sum/description/
 * Find two indices whose values sum to target.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lc1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Lc1 solution = new Lc1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
