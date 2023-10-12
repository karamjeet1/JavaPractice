import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 1, -4 };
        int targetSum = 1;
        System.out.println(threeSum(arr, targetSum));

    }

    public static int threeSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n - 2; i++) {
            int lo = i + 1, hi = n - 1;
            while (lo < hi) {
                int currSum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum; // Update the closestSum if a closer sum is found
                }
                if (currSum < target) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return -1;
    }
}
