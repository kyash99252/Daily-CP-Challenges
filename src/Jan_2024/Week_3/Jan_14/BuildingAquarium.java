package Jan_2024.Week_3.Jan_14;

// Date - January 14, 2024
// Platform - CodeForces
// Problem Name - Building an Aquarium
// Problem Link - https://codeforces.com/problemset/problem/1873/E
// Submission Link - https://codeforces.com/contest/1873/submission/243757172
// Time Complexity - O(n logm)
// Space Complexity - O(n)

import java.util.Scanner;

public class BuildingAquarium {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                nums[i] = sc.nextInt();
            }
            long low = 0;
            long high = Integer.MAX_VALUE;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                long total = 0;
                for (int i = 0; i < n; ++i) {
                    total += Math.max(mid - nums[i], 0L);
                }
                if (total <= x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(high);
        }
    }
}

