package Jan_2024.Week_1.Jan_4;

// Date - January 4, 2024
// Platform - CodeForces
// Problem Name - Songs Compression
// Problem Link - https://codeforces.com/problemset/problem/1015/C
// Submission Link - https://codeforces.com/contest/1015/submission/240225044
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.Arrays;
import java.util.Scanner;

public class SongsCompression {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long m = sc.nextLong();

        long[] a = new long[n];
        long[] b = new long[n];
        long[] diff = new long[n];

        long suma = 0;
        long sumb = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();

            diff[i] = a[i] - b[i];

            suma += a[i];
            sumb += b[i];
        }

        if (sumb > m) {
            System.out.println(-1);
        } else if (suma <= m) {
            System.out.println(0);
        } else {
            long target = suma - m;
            Arrays.sort(diff);
            int count = 0;
            int i = n - 1;
            while (target > 0) {
                target -= diff[i];
                --i;
                ++count;
            }
            System.out.println(count);
        }
    }
}
