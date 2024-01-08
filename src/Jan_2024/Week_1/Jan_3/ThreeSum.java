package Jan_2024.Week_1.Jan_3;

// Date - January 3, 2024
// Platform - LeetCode
// Problem Name - 3 Sum
// Problem Link - https://leetcode.com/problems/3sum/
// Submission Link - https://leetcode.com/submissions/detail/1135437053/
// Time Complexity - O(n^2)
// Space Complexity - O(n)

import java.util.*;
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    ++left;
                    --right;
                } else if (sum < 0) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return new ArrayList<>(set);
    }
}