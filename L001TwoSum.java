import java.util.*;

public class L001TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            // Store current number and its index in the map
            numToIndex.put(nums[i], i);
        }
        // No solution found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to the target:");
            System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
