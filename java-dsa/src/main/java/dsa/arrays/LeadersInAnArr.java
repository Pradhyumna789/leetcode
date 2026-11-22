package dsa.arrays;
import java.util.*;

public class LeadersInAnArr {
    public List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int max = nums[n - 1];
        ans.add(nums[n - 1]);
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}
