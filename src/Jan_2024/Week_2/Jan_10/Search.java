package Jan_2024.Week_2.Jan_10;

// Date - January 10, 2024
// Platform - LeetCode
// Problem Name - Search in Rotated Sorted Array II
// Problem Link - https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
// Submission Link - https://leetcode.com/submissions/detail/1142289760/
// Time Complexity - O(n)
// Space Complexity - O(1)

class Search {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return true;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                ++low;
                --high;
                continue;
            }
            if (nums[mid] >= nums[low]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[high] >= target && target >= nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }    
        return false;
    }
}