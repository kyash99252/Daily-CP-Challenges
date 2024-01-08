package Jan_2024.Week_2.Jan_8;

// Date - January 8, 2024
// Platform - CodeForces
// Problem Name - Removal of Unattractive Pairs
// Problem Link - https://codeforces.com/problemset/problem/1725/B
// Submission Link - https://codeforces.com/contest/1725/submission/240817509
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BasketballTogether {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] nums = new int[n];
        fill(nums, n);

        System.out.println(teams(nums, n, d));
    }

    public static void fill(int[] nums, int n) {
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }
    }

    public static int teams(int[] nums, int n, int d) {
        Arrays.sort(nums);
        int team = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            list.add(nums[i]);
        }
        while (!list.isEmpty()) {
            int x = d / list.get(list.size() - 1);
            if (x + 1 > list.size()) break;
            ++team;
            list.remove(list.size() - 1);
            for (int i = 0; i < x; ++i) {
                list.remove(0);
            }
        }
        return team;
    }
}
