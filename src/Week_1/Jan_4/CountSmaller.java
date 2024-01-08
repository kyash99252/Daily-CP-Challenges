package Week_1.Jan_4;

// Date - January 4, 2024
// Platform - LeetCode
// Problem Name - Count of Smaller Numbers After Self
// Problem Link - https://leetcode.com/problems/count-of-smaller-numbers-after-self/
// Submission Link - https://leetcode.com/submissions/detail/1136579358/
// Time Complexity - O(n^2)
// Space Complexity - O(n)


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CountSmaller {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> link = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int idx = insert(list, nums[i]);
            link.add(0, idx);
        }
        return link;
    }
    private int insert(List<Integer> list, int num) {
        int left = 0;
        int right = list.size() - 1;

        if (list.isEmpty() || num < list.get(0)) {
            list.add(0, num);
            return 0;
        }

        if (num > list.get(right)) {
            list.add(num);
            return right + 1;
        }

        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (num <= list.get(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (num <= list.get(left)) {
            list.add(left, num);
            return left;
        } else if (num > list.get(right)) {
            list.add(right + 1, num);
            return right + 1;
        } else {
            list.add(right, num);
            return right;
        }
    }
}