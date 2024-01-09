package Jan_2024.Week_2.Jan_9;

// Date - January 9, 2024
// Platform - LeetCode
// Problem Name - Median of Two Sorted Arrays
// Problem Link - https://leetcode.com/problems/median-of-two-sorted-arrays/description/
// Submission Link - https://leetcode.com/submissions/detail/1141400379/
// Time Complexity - O(log(min(m, n)))
// Space Complexity - O(1)

class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n) return findMedianSortedArrays(nums2, nums1);

        int low = 0, high = m;
        int left = (m + n + 1) >> 1;
        int k = m + n;
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];
            if (l1 <= r2 && l2 <= r1) {
                if (k % 2 == 1) return Math.max(l1, l2);
                return ((double)(Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            }
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}
