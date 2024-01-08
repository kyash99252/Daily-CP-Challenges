package Week_1.Jan_6;

// Date - January 6, 2024
// Platform - CodeForces
// Problem Name - Luke is a Foodie
// Problem Link - https://codeforces.com/problemset/problem/1704/B
// Submission Link - https://codeforces.com/contest/1704/submission/240652629
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.Scanner;

public class FoodieLuke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] numbers = new int[n+1];
            for (int i = 1; i <= n; i++) {
                numbers[i] = scanner.nextInt();
            }
            int num_min = numbers[1];
            int num_max = numbers[1];
            int res = 0;
            for (int i = 2; i <= n; i++) {
                if (numbers[i] > num_max) {
                    num_max = numbers[i];
                }
                if (numbers[i] < num_min) {
                    num_min = numbers[i];
                }
                if (num_max - num_min > 2 * x) {
                    res++;
                    num_min = num_max = numbers[i];
                }
            }
            System.out.println(res);
        }
        scanner.close();
    }
}

