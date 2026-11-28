package dsa.arrays;

public class removeDuplicatesFromSortedArr {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != nums[j]) {
                nums[j + 1] = nums[i];
                j++;
            }
        }

        return j + 1;
    }
}
