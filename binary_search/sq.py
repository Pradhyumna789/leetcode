def square_root(n: int) -> int:
    if n == 0:
        return 0
    left = 1
    right = n
    res = -1
    while left <= right:
        mid = (left + right) // 2
        if mid * mid == n:
            return mid
        elif mid * mid > n:
            res = mid
            right = mid - 1
        else:
            left = mid + 1
    return res - 1

if __name__ == "__main__":
    n = int(input())
    res = square_root(n)
    print(res)