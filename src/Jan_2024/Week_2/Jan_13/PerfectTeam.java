package Jan_2024.Week_2.Jan_13;

// Date - January 13, 2024
// Platform - CodeForces
// Problem Name - Perfect Team
// Problem Link - https://codeforces.com/problemset/problem/1221/C
// Submission Link - https://codeforces.com/contest/1221/submission/243723095
// Time Complexity - O(n)
// Space Complexity - O(1)

import java.util.Scanner;

public class PerfectTeam {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int q = sc.nextInt();
        while (q-- > 0) {
            int[] nums = new int[3];
            long sum = 0L;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 3; ++i) {
                nums[i] = sc.nextInt();
                sum += nums[i];
                min = Math.min(nums[i], min);
            }
            if (sum < 3 || nums[0] == 0 || nums[1] == 0) {
                System.out.println(0);
            } else {
                int count = min;
                for (int i = 0; i < 3; ++i) {
                    nums[i] -= min;
                }
                if (nums[0] == 0 || nums[1] == 0) {
                    System.out.println(count);
                } else {
                    int left = nums[0] + nums[1];
                    int alt = count + Math.min(nums[0], nums[1]);
                    count += (left / 3);
                    System.out.println(Math.min(alt, count));
                }
            }
        }
    }
}
