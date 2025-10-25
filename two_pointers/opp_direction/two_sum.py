def two_sum_sorted(arr: list[int], target: int) -> list[int]:
    left, right = 0, len(arr) - 1
    while left < right:
        two_sum = arr[left] + arr[right]
        if two_sum == target:
            return [left, right]
        elif two_sum > target:
            right -= 1
        else:
            left += 1
    return []

if __name__ == "__main__":
    arr = [int(x) for x in input().split()]
    target = int(input())
    res = two_sum_sorted(arr, target)
    print(" ".join(map(str, res)))
