// https://leetcode.com/problems/move-zeroes/description/
package dsa.arrays;

public class moveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int j = 0; 
        int temp;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
