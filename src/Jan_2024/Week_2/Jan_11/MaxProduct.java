package Jan_2024.Week_2.Jan_11;

// Date - January 11, 2024
// Platform - LeetCode
// Problem Name - Maximum Product of Word Lengths
// Problem Link - https://leetcode.com/problems/maximum-product-of-word-lengths/description/
// Submission Link - https://leetcode.com/submissions/detail/1143031838/
// Time Complexity - O(n^2)
// Space Complexity - O(n)

class MaxProduct {
    public int maxProduct(String[] words) {
        int ans = 0;
        int[] state = new int[words.length];
        for (int i = 0; i < words.length; ++i) {
            for (char ch: words[i].toCharArray()) {
                state[i] |= 1 << (ch - 'a');
            }

            for (int j = 0; j < i; ++j) {
                if ((state[i] & state[j]) == 0) {
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
        return ans;
    }
}