package Jan_2024.Week_2.Jan_7;

// Date - January 7, 2024
// Platform - CodeForces
// Problem Name - Permutation Swap
// Problem Link - https://codeforces.com/contest/1828/problem/B
// Submission Link - https://codeforces.com/contest/1828/submission/240766896
// Time Complexity - O(n + logn)
// Space Complexity - O(n)

import java.util.Scanner;

public class PermutationSwap {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] nums = new int[n];
            int[] diff = new int[n];
            fillArray(nums, diff,  n);

            System.out.println(findGCD(diff, n));
        }
    }
    public static void fillArray(int[] nums, int[] diff, int n) {
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
            diff[i] = Math.abs(nums[i] - (i + 1));
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int findGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);

            if(result == 1) {
                return 1;
            }
        }
        return result;
    }


}
