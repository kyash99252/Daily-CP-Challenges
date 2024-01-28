package Jan_2024.Week_3.Jan_14;

// Date - January 14, 2024
// Platform - LeetCode
// Problem Name - Super Egg Drop
// Problem Link - https://leetcode.com/problems/super-egg-drop/description/
// Submission Link - https://leetcode.com/submissions/detail/1159021089/
// Time Complexity - O(kn^2)
// Space Complexity - O(kn)

import java.util.Arrays;

class SuperEggDrop {
    static int[][] t;
    public int superEggDrop(int k, int n) {
        t = new int[k + 1][n + 1];
        for (int[] i: t) {
            Arrays.fill(i, -1);
        }
        return solve(k, n);
    }
    private int solve(int k, int n) {
        if (n == 0 || n == 1 || k == 1) return n;
        if (t[k][n] != -1) return t[k][n];
        int ans = Integer.MAX_VALUE;
        int l = 1;
        int h = n;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int left = solve(k - 1, mid - 1);
            int right = solve(k, n - mid);
            int temp = 1 + Math.max(left, right);
            if (left < right) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
            ans = Math.min(ans, temp);
        }
        return t[k][n] = ans;
    }
}
