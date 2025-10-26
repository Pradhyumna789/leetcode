# O(1) => Space complexity
def is_palindrome(s: str) -> bool:
    left, right = 0, len(s) - 1
    while left < right:
        while left < right and not s[left].isalnum():
            left += 1
        while left < right and not s[right].isalnum():
            right -= 1
        if s[left].lower() != s[right].lower():
            return False
        left += 1
        right -= 1
    return True

# O(N) => Space complexity
# def is_palindrome(s: str) -> bool:
#     arr = []
#     for c in s:
#         if c.isalnum():
#             arr.append(c.lower())
#     left, right = 0, len(arr) - 1
#     while left < right:
#         if arr[left] != arr[right]:
#             return False
#         left += 1
#         right -= 1
#     return True

if __name__ == "__main__":
    s = input()
    res = is_palindrome(s)
    print("true" if res else "false")