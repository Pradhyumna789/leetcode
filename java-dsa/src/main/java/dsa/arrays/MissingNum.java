package dsa.arrays;

public class MissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfArr = 0;

        int sum = (n * (n + 1)) / 2;

        for(int i = 0; i < n; i++) {
            sumOfArr += nums[i];
        }

        return sum - sumOfArr;
    }
}
