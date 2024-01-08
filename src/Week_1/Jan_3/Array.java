package Week_1.Jan_3;

// Date - January 3, 2024
// Platform - CodeForces
// Problem Name - Arrays
// Problem Link - https://codeforces.com/problemset/problem/572/A
// Submission Link - https://codeforces.com/contest/572/submission/240101845
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int k = sc.nextInt();
        int m = sc.nextInt();

        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];

        fillArray(nums1, n1);
        fillArray(nums2, n2);

        int target = nums1[k - 1];
        System.out.println(search(target, m, nums2) ? "YES" : "NO");
    }

    public static void fillArray(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
    }

    public static boolean search(int target, int m, int[] nums) {
        int i = 0;
        while (i < nums.length && nums[i] <= target) {
            ++i;
        }
        if (m <= nums.length - i) {
            return true;
        }
        return false;
    }
}
