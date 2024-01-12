package Jan_2024.Week_2.Jan_12;

// Date - January 12, 2024
// Platform - CodeForces
// Problem Name - Flower City Fence
// Problem Link - https://codeforces.com/contest/1862/problem/C
// Submission Link - https://codeforces.com/contest/1862/submission/241251723
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.Scanner;

public class FlowerCityFence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) nums[i] = sc.nextInt();

            boolean flag = true;

            for (int i = 0; i < n; ++i) {
                if (nums[i] > n) {
                    flag = false;
                    break;
                } else {
                    int target = i + 1;
                    int count = countElementsGreaterThanOrEqual(nums, target);
                    if (count != nums[i]) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static int countElementsGreaterThanOrEqual(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high + 1;
    }
}
