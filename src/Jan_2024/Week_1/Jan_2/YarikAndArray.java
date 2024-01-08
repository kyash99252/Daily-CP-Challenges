package Jan_2024.Week_1.Jan_2;

// Date - January 2, 2024
// Platform - CodeForces
// Problem Name - Yarik And Subarray
// Problem Link - https://codeforces.com/contest/1899/problem/C
// Submission Link - https://codeforces.com/contest/1899/submission/239979485
// Time Complexity - O(n)
// Space Complexity - O(1)

import java.util.Scanner;

public class YarikAndArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            fillArray(a, n);
            int ans = maxSum(a);
            System.out.println(ans);
        }
    }
    public static void fillArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }
    public static int maxSum(int[] a) {
        int max = Integer.MIN_VALUE;
        int sum = a[0];
        int par = Math.abs(a[0]) % 2;
        int maxElem = a[0];
        for (int i = 1; i < a.length; i++) {
            if (Math.abs(a[i]) % 2 != par) {
                sum += a[i];
            } else {
                sum = a[i];
            }
            if (a[i] > sum) {
                sum = a[i];
            }
            par = Math.abs(a[i]) % 2;
            max = Math.max(max, sum);
            maxElem = Math.max(maxElem, a[i]);
        }
        return Math.max(max, maxElem);
    }
}
