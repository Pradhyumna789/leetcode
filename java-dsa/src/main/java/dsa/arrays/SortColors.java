package dsa.arrays;

public class SortColors {
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a]; 
        nums[a] = nums[b]; 
        nums[b] = temp; 
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }
}
