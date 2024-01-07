package Jan_7;

// Date - January 7, 2024
// Platform - LeetCode
// Problem Name - Merge Sorted Array
// Problem Link - https://leetcode.com/problems/merge-sorted-array/description/
// Submission Link - https://leetcode.com/submissions/detail/1139764197/
// Time Complexity - O(m + n)
// Space Complexity - O(1)

class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0){
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) return;
        int l = nums1.length - 1;
        n--;
        for (int i = m - 1; i >= 0 && n >= 0; ) {
            if (nums1[i] > nums2[n]) {
                nums1[l] = nums1[i];
                nums1[i] = Integer.MIN_VALUE;
                l--;
                i--;
            }
            else if (nums1[i] <= nums2[n]) {
                nums1[l] = nums2[n];
                l--;
                n--;
            }
        }
        while (n >= 0) {
            nums1[l] = nums2[n];
            l--;
            n--;
        }
    }
}
