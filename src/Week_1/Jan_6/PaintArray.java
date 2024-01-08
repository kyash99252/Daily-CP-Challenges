package Week_1.Jan_6;

// Date - January 6, 2024
// Platform - CodeForces
// Problem Name - Paint the Array
// Problem Link - https://codeforces.com/problemset/problem/1618/C
// Submission Link - https://codeforces.com/contest/1618/submission/240654576
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.*;

public class PaintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            solve(scanner);
        }
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        long[] g = {a[0], a[1]};
        for(int i = 0; i < n; i++) {
            g[i % 2] = gcd(g[i % 2], a[i]);
        }
        boolean[] good = {true, true};
        for(int i = 0; i < n; i++) {
            good[i % 2] = good[i % 2] && (a[i] % g[(i % 2) ^ 1] > 0);
        }
        long ans = 0;
        for(int i = 0; i < 2; i++) {
            if(good[i]) {
                ans = Math.max(ans, g[i ^ 1]);
            }
        }
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
