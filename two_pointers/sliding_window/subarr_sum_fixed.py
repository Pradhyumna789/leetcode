# sample input arr = 1 2 3 7 4 1 and target = 3
import math

def subarray_sum_fixed(nums: list[int], k: int) -> int:
    left, right = 0, 0
    max_sum = -math.inf
    window_size = 0
    window_sum = 0
    for i in range(0, len(nums)):
        window_sum += nums[i]
        right += 1
        window_size = right - left
        if window_size == k:
            max_sum = max(max_sum, window_sum)
            window_sum -= nums[left]
            left += 1
    return max_sum

if __name__ == "__main__":
    nums = [int(x) for x in input().split()]
    k = int(input())
    res = subarray_sum_fixed(nums, k)
    print(res)
