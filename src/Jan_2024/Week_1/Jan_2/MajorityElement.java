package Jan_2024.Week_1.Jan_2;

// Date - January 2, 2024
// Platform - LeetCode
// Problem Name - Majority Element
// Problem Link - https://leetcode.com/problems/majority-element/
// Submission Link - https://leetcode.com/problems/majority-element/submissions/1133995922/?submissionId=1133995922

import java.util.*;
class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > (nums.length / 2)) {
                return nums[i];
            }
        }
        return -1;
    }
}