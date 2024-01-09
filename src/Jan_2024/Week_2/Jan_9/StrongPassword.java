package Jan_2024.Week_2.Jan_9;

// Date - January 9, 2024
// Platform - CodeForces
// Problem Name - Strong Password
// Problem Link - https://codeforces.com/problemset/problem/1845/C
// Submission Link - https://codeforces.com/contest/1845/submission/240942126
// Time Complexity - O(m*n*r)
// Space Complexity - O(n)

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            int m = sc.nextInt();
            sc.nextLine();
            String l = sc.nextLine();
            String r = sc.nextLine();
            int mx = 0;
            for (int i = 0; i < m; ++i) {
                int li = Character.getNumericValue(l.charAt(i));
                int ri = Character.getNumericValue(r.charAt(i));
                int nmx = mx;
                for (int c = li; c <= ri; ++c) {
                    int cur = mx;
                    while (cur < n && Character.getNumericValue(s.charAt(cur)) != c) {
                        cur += 1;
                    }
                    nmx = Math.max(nmx, cur);
                }
                mx = nmx + 1;
            }
            System.out.println(mx > n ? "YES" : "NO");
        }
    }
}
