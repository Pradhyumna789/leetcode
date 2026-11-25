package dsa.arrays;
import java.util.*;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] values = new int[n][2];

        int[] ans = new int[2];

        for(int i = 0; i < n; i++) {
            values[i][0] = nums[i];
            values[i][1] = i;
        }   

        Arrays.sort(values, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = n - 1;

        for(int i = 0; i < n; i++) {
            int sum = values[left][0] + values[right][0];

            if(sum == target) {
                ans[0] = values[left][1];
                ans[1] = values[right][1];
                return ans;
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }
}
