package Jan_2024.Week_2.Jan_11;

// Date - January 11, 2024
// Platform - CodeForces
// Problem Name - Kuroni and Simple Strings
// Problem Link - https://codeforces.com/contest/1305/problem/B
// Submission Link - https://codeforces.com/contest/1305/submission/241142711
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SimpleStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        List<Integer> open = new ArrayList<>();
        List<Integer> close = new ArrayList<>();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                open.add(i);
            }
            else {
                close.add(i);
            }
        }

        List<Integer> del = new ArrayList<>();
        int left = 0;
        int right = close.size() - 1;

        while (left < open.size() && right >= 0) {
            if (open.get(left) > close.get(right)) break;
            del.add(open.get(left));
            del.add(close.get(right));
            ++left;
            --right;
        }

        Collections.sort(del);
        if (del.size() == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(1);
            System.out.println(del.size());
            for (int num: del) {
                System.out.print((num + 1) + " ");
            }
            System.out.println();
        }
    }
}
