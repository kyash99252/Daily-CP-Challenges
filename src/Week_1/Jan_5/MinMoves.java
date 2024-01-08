package Week_1.Jan_5;

// Date - January 5, 2024
// Platform - LeetCode
// Problem Name - Minimum Moves to Equal Array Elements
// Problem Link - https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
// Submission Link - https://leetcode.com/submissions/detail/1136913987/
// Time Complexity - O(n)
// Space Complexity - O(1)

class MinMoves {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; ++i) {
            min = Math.min(nums[i], min);
        }

        int diff = 0;

        for (int i = 0; i < nums.length; ++i) {
            diff += (nums[i] - min);
        }

        return diff;
    }
}