package Jan_2024.Week_3.Jan_14;

// Date - January 14, 2024
// Platform - LeetCode
// Problem Name - Excel Sheet Column Number
// Problem Link - https://leetcode.com/problems/excel-sheet-column-number/description/
// Submission Link - https://leetcode.com/submissions/detail/1159005530/
// Time Complexity - O(n)
// Space Complexity - O(1)

class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        for (int i = 0; i < columnTitle.length() - 1; ++i) {
            num += 26 * Math.pow(26, i);
        }
        for (int i = 0; i < columnTitle.length() - 1; ++i) {
            int temp = (columnTitle.charAt(i) - 'A');
            num += temp * Math.pow(26, columnTitle.length() - i - 1);
        }
        num += columnTitle.charAt(columnTitle.length() - 1) - 'A'+ 1;
        return num;
    }
}