package Jan_2024.Week_2.Jan_10;

// Date - January 10, 2024
// Platform - CodeForces
// Problem Name - Move Brackets
// Problem Link - https://codeforces.com/problemset/problem/1374/C
// Submission Link - https://codeforces.com/contest/1374/submission/232588205
// Time Complexity - O(n^2)
// Space Complexity - O(n)

import java.util.ArrayList;
import java.util.Scanner;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            ArrayList<Character> a = new ArrayList<>();
            for (char c : ch) {
                a.add(c);
            }
            int i = 0;
            int size = a.size() - 1;
            while (i < size) {
                if (a.get(i) == '(' && a.get(i + 1) == ')') {
                    a.remove(i);
                    a.remove(i);
                    if (i > 0) {
                        i--;
                    }
                    size -= 2;
                } else {
                    i++;
                }
            }
            System.out.println(a.size() / 2);
        }
        sc.close();
    }
}