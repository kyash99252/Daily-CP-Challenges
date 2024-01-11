package Jan_2024.Week_2.Jan_11;

// Date - January 11, 2024
// Platform - LeetCode
// Problem Name - Kth Smallest Number in Multiplication Table
// Problem Link - https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/description/
// Submission Link - https://leetcode.com/submissions/detail/1143162970/
// Time Complexity - O(mlog(m*n))
// Space Complexity - O(1)

class FindKthNumber {
    public int findKthNumber(int m, int n, int k) {
        int low = 0;
        int high = m * n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int i = 1; i <= m; ++i) {
                count += n < mid / i ? n : mid / i;
            }
            if (count >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}