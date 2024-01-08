package Jan_2024.Week_2.Jan_7;

// Date - January 7, 2024
// Platform - LeetCode
// Problem Name - 4Sum
// Problem Link - https://leetcode.com/problems/4sum/description/
// Submission Link - https://leetcode.com/submissions/detail/1139759365/
// Time Complexity - O(n^3)
// Space Complexity - O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        long sum = 0;
        long temp;

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        temp = (long) target - (long) nums[i] - (long) nums[j];
                        int k = j + 1;
                        int l = nums.length - 1;

                        while (k < l) {
                            sum = (long) nums[k] + (long) nums[l];

                            if (sum == temp) {
                                ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                                while (k < l && nums[l] == nums[l - 1])
                                    l--;
                                while (k < l && nums[k] == nums[k + 1])
                                    k++;
                                l--;
                                k++;
                            } else if (sum < temp) {
                                k++;
                            } else {
                                l--;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}