package Jan_2024.Week_2.Jan_9;

// Date - January 9, 2024
// Platform - CodeForces
// Problem Name - Poisoned Dagger
// Problem Link - https://codeforces.com/problemset/problem/1613/C
// Submission Link - https://codeforces.com/contest/1613/submission/240937825
// Time Complexity - O(nlogh)
// Space Complexity - O(n)

import java.util.Scanner;

public class PoisonedDagger {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) nums[i] = sc.nextInt();

            int low = 1;
            int high = h;
            int res = -1;

            while (low <= high) {
                int k = low + ((high - low) / 2);
                if (isPossible(nums, k, h)) {
                    res = k;
                    high = k - 1;
                } else {
                    low = k + 1;
                }
            }
            System.out.println(res);
        }
    }
    public static boolean isPossible(int[] nums, int k, int h) {
        int curr_health = h;
        for (int i = 0; i < nums.length - 1; ++i) {
            curr_health -= Math.min(k, nums[i + 1] - nums[i]);
        }
        if (curr_health <= k) {
            return true;
        }
        return false;
    }
}
