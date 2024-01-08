package Week_2.Jan_8;

// Date - January 8, 2024
// Platform - LeetCode
// Problem Name - Minimum Window Substring
// Problem Link - https://leetcode.com/problems/minimum-window-substring/description/
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.HashMap;
import java.util.Map;

class MinWindow {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int len = Integer.MAX_VALUE;
        int head = 0;
        int reqChars = t.length();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)) {
                int count = map.get(rightChar);
                if (count > 0) {
                    --reqChars;
                }
                map.put(rightChar, count - 1);
            }

            while (reqChars == 0) {
                if (right - left < len) {
                    len = right - left;
                    head = left;
                }

                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    int count = map.get(leftChar);
                    map.put(leftChar, count + 1);
                    if (count >= 0) {
                        ++reqChars;
                    }
                }

                left++;
            }

            right++;
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(head, head + len + 1);
    }
}
