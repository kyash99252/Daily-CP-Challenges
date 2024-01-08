package Week_1.Jan_6;

// Date - January 6, 2024
// Platform - LeetCode
// Problem Name - Non-decreasing Array
// Problem Link - https://leetcode.com/problems/non-decreasing-array/description/
// Submission Link - https://leetcode.com/submissions/detail/1139291817/
// Time Complexity - O(n)
// Space Complexity - O(1)

class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                ++count;
                if (count > 1) {
                    return false;
                }
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return true;
    }
}