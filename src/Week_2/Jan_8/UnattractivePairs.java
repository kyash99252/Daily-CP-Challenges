package Week_2.Jan_8;

// Date - January 8, 2024
// Platform - CodeForces
// Problem Name - Removal of Unattractive Pairs
// Problem Link - https://codeforces.com/contest/1907/problem/C
// Submission Link - https://codeforces.com/contest/1907/submission/240804496
// Time Complexity - O(n)
// Space Complexity - O(1)

import java.util.Arrays;
import java.util.Scanner;

public class UnattractivePairs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] count = new int[26];
            for (char c: s.toCharArray()) {
                count[c - 'a']++;
            }
            int max = Arrays.stream(count).max().getAsInt();
            System.out.println(Math.max(n % 2, 2 * max - n));
        }
    }
}
