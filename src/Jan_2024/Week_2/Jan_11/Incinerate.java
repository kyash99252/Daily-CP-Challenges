package Jan_2024.Week_2.Jan_11;

// Date - January 11, 2024
// Platform - CodeForces
// Problem Name - Incinerate
// Problem Link - https://codeforces.com/contest/1763/problem/B
// Submission Link - https://codeforces.com/contest/1763/submission/241146255
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.Arrays;
import java.util.Scanner;

public class Incinerate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] h = new int[n];
            int[] p = new int[n];
            fill(h);
            fill(p);

            int[] ord = new int[n];
            for (int i = 0; i < n; ++i) ord[i] = i;

            Integer[] ord1 = new Integer[n];
            for (int i = 0; i < n; ++i) {
                ord1[i] = i;
            }

            Arrays.sort(ord1, (x, y) -> Integer.compare(p[x], p[y]));

            int[] sortedOrd = Arrays.stream(ord1).mapToInt(Integer::intValue).toArray();


            int d = 0;
            boolean flag = true;
            for (int i: sortedOrd) {
                if (h[i] <= d) {
                    continue;
                }
                if (i != sortedOrd[0]) {
                    k -= p[i];
                }
                if (k > 0) {
                    d += k;
                    while (h[i] > d) {
                        k -= p[i];
                        if (k < 0) break;
                        d += k;
                    }
                }
                if (h[i] > d) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            }
        }
    }
    public static void fill(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = sc.nextInt();
        }
    }
}
