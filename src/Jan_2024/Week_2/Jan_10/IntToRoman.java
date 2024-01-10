package Jan_2024.Week_2.Jan_10;

// Date - January 10, 2024
// Platform - LeetCode
// Problem Name - Integer to Roman
// Problem Link - https://leetcode.com/problems/integer-to-roman/description/
// Submission Link - https://leetcode.com/submissions/detail/1142144476/
// Time Complexity - O(1)
// Space Complexity - O(1)

class IntToRoman {
    public String intToRoman(int num) {
        int[] keys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] values = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keys.length && num > 0; i++) {
            while (num >= keys[i]) {
                sb.append(values[i]);
                num -= keys[i];
            }
        }
        return sb.toString();
    }
}
