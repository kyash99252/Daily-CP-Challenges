package Jan_2024.Week_2.Jan_13;

// Date - January 13, 2024
// Platform - CodeForces
// Problem Name - Set of Strings
// Problem Link - https://codeforces.com/problemset/problem/544/A
// Submission Link - https://codeforces.com/contest/544/submission/243717943
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SetOfStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt();
        String q = sc.next();
        String[] array = new String[k];
        Map<Character, Integer> map = new LinkedHashMap<>();
        int idx = 0;
        for (char ch: q.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, idx);
            }
            ++idx;
        }
        if (map.size() < k) {
            System.out.println("NO");
        } else {
            Integer[] indices = map.values().toArray(new Integer[0]);
            for (int i = 0; i < k; ++i) {
                int start = indices[i];
                int end = (i == k - 1) ? q.length() : indices[i + 1];
                array[i] = q.substring(start, end);
            }
            System.out.println("YES");
            for (String s : array) {
                System.out.println(s);
            }
        }
    }
}
