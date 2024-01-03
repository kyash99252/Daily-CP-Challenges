package Jan_3;

// Date - January 3, 2024
// Platform - LeetCode
// Problem Name - 3 Sum
// Problem Link - https://leetcode.com/problems/largest-number/description/
// Submission Link - https://leetcode.com/submissions/detail/1135531029/
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.*;
class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        if (strNums[0].equals("0")) {
            return "0";
        }

        String largestNumberStr = String.join("", strNums);
        return largestNumberStr;
    }
}