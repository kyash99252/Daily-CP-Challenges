package Jan_2024.Week_1.Jan_6;

// Date - January 6, 2024
// Platform - LeetCode
// Problem Name - Naming a Company
// Problem Link - https://leetcode.com/problems/naming-a-company/description/
// Submission Link - https://leetcode.com/submissions/detail/1139263902/
// Time Complexity - O(n + 26^2.m)
// Space Complexity - O(n + 26^2)


import java.util.HashSet;
import java.util.Set;

class DistinctNames {
    public long distinctNames(String[] ideas) {
        Set<String>[] sets = new Set[26];
        for (int i = 0; i < 26; i++) {
            sets[i] = new HashSet();
        }
        for (String s : ideas) {
            sets[s.charAt(0) - 'a'].add(s.substring(1));
        }
        int[][] same = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (String s : sets[i]) {
                for (int j = i + 1; j < 26; j++) {
                    if (sets[j].contains(s)) {
                        same[i][j]++;
                    }
                }
            }
        }
        long res = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                res += (sets[i].size() - same[i][j]) * (sets[j].size() - same[i][j]) * 2;
            }
        }
        return res;
    }
}