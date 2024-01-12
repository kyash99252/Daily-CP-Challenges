package Jan_2024.Week_2.Jan_12;

// Date - January 12, 2024
// Platform - LeetCode
// Problem Name - Peak Index in a Mountain Array
// Problem Link - https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Submission Link - https://leetcode.com/submissions/detail/1143988928/
// Time Complexity - O(logn)
// Space Complexity - O(1)

class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}