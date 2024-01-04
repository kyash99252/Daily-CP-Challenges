package Jan_4;

// Date - January 4, 2024
// Platform - CodeForces
// Problem Name - Songs Compression
// Problem Link - https://codeforces.com/problemset/problem/1291/b
// Submission Link - https://codeforces.com/contest/1291/submission/240236207
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.Scanner;

public class ArraySharpening {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            int[] nums = new int[n];
            fillArray(nums, n);

            System.out.println(validate(nums, n) ? "Yes" : "No");
        }
    }
    public static void fillArray(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
    }
    public static boolean validate(int[] nums, int n) {
        int prefix = -1;
        int suffix = n - 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < i) break;
            prefix = i;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < (n - 1) - i) break;
            suffix = i;
        }
        if (suffix <= prefix) {
            return true;
        }
        return false;
    }
}
