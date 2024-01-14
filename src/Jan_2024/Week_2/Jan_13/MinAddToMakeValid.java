package Jan_2024.Week_2.Jan_13;

// Date - January 13, 2024
// Platform - LeetCode
// Problem Name - Minimum Add to Make Parentheses Valid
// Problem Link - https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
// Submission Link - https://leetcode.com/submissions/detail/1146098161/
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.Stack;

class MinAddToMakeValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ')') {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
