def remove_duplicates(arr: list[int]) -> int:
    slow, fast = 0, 1
    while fast < len(arr):
        if arr[slow] == arr[fast]:
            fast += 1
        else:
            slow += 1
            arr[slow] = arr[fast]
            fast += 1
    return slow + 1

if __name__ == "__main__":
    arr = [int(x) for x in input().split()]
    res = remove_duplicates(arr)
    print(" ".join(map(str, arr[:res])))


