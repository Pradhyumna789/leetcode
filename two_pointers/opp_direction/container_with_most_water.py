def container_with_most_water(arr: list[int]) -> int:
    left, right = 0, len(arr) - 1
    max_area = -1
    while left < right:
        curr_area = (right - left) * min(arr[left], arr[right])
        max_area = max(max_area, curr_area)
        if arr[left] < arr[right]:
            left += 1
        else:
            right -= 1
    return max_area

if __name__ == "__main__":
    arr = [int(x) for x in input().split()]
    res = container_with_most_water(arr)
    print(res)