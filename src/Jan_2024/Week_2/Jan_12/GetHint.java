package Jan_2024.Week_2.Jan_12;

// Date - January 12, 2024
// Platform - LeetCode
// Problem Name - Bulls and Cows
// Problem Link - https://leetcode.com/problems/bulls-and-cows/description/
// Submission Link - https://leetcode.com/submissions/detail/1144009491/
// Time Complexity - O(n)
// Space Complexity - O(1)

import java.util.HashMap;

class GetHint {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        char[] ch1 = secret.toCharArray();
        char[] ch2 = guess.toCharArray();
        HashMap<Character, Integer> table = new HashMap<>();
        for (char c: ch1) {
            table.put(c, table.getOrDefault(c, 0) + 1);
        }

        int bull = 0;
        int cows = 0;
        for (int i = 0; i < n; ++i) {
            if (ch1[i] == ch2[i]) {
                ++bull;
                if (table.get(ch1[i]) <= 0) {
                    --cows;
                }
                table.put(ch1[i], table.get(ch1[i]) - 1);
            } else if (table.getOrDefault(ch2[i], 0) > 0) {
                ++cows;
                table.put(ch2[i], table.get(ch2[i]) - 1);
            }
        }
        String ans = bull + "A" + cows + "B";
        return ans;
    }
}
