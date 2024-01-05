# Date - January 5, 2024
# Platform - CodeForces
# Problem Name - Raspberries
# Problem Link - https://codeforces.com/problemset/problem/1883/C
# Submission Link - https://codeforces.com/contest/1883/submission/240378386
# Time Complexity - O(n*t)
# Space Complexity - O(n)

t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    nums = list(map(int, input().split()))
    prod = 1
    for num in nums:
        prod *= num

    if prod % k == 0:
        print(0)
    elif k == 2:
        print(1)
    elif k == 4:
        even = 0
        four = False
        for num in nums:
            if num % 4 == 3:
                four = True
            if num % 2 == 0:
                even += 1
        if four:
            print(1)
        else:
            if even == 0:
                print(2)
            else:
                print(1)
    elif k == 5:
        min_mod = float('inf')
        for num in nums:
            mod = 5 - (num % 5)
            min_mod = min(min_mod, mod)
        print(min_mod)
    elif k == 3:
        min3 = float('inf')
        for num in nums:
            mod3 = 3 - (num % 3)
            min3 = min(min3, mod3)
        print(min3)
