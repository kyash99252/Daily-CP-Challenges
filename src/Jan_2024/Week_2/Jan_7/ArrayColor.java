package Jan_2024.Week_2.Jan_7;

// Date - January 7, 2024
// Platform - CodeForces
// Problem Name - Array Coloring
// Problem Link - https://codeforces.com/contest/1857/problem/A
// Submission Link - https://codeforces.com/contest/1857/submission/240734428
// Time Complexity - O(n)
// Space Complexity - O(1)

import java.util.Scanner;

public class ArrayColor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long sum = 0;

            for (int i = 0; i < n; ++i) {
                int temp = sc.nextInt();
                sum += temp;
            }

            if ((sum & 1) != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
