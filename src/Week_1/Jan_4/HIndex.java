package Week_1.Jan_4;

// Date - January 4, 2024
// Platform - LeetCode
// Problem Name - H-Index
// Problem Link - https://leetcode.com/problems/h-index/
// Submission Link - https://leetcode.com/submissions/detail/1136379005/
// Time Complexity - O(nlogn)
// Space Complexity - O(1)

import java.util.*;
class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
