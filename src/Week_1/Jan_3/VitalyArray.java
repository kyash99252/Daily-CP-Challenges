package Week_1.Jan_3;

// Date - January 3, 2024
// Platform - CodeForces
// Problem Name - Array
// Problem Link - https://codeforces.com/problemset/problem/300/A
// Submission Link - https://codeforces.com/contest/300/submission/240119866
// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VitalyArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        List<Integer> pos = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > 0) {
                pos.add(temp);
            } else if (temp < 0) {
                neg.add(temp);
            } else {
                zero.add(temp);
            }
        }
        if (neg.size() % 2 == 0) {
            int temp = neg.removeFirst();
            zero.add(temp);
        }
        if (pos.size() == 0) {
            int temp1 = neg.removeFirst();
            int temp2 = neg.removeFirst();

            pos.add(temp1);
            pos.add(temp2);
        }
        System.out.print(STR."\{neg.size()} ");
        for (int i = 0; i < neg.size(); i++) {
            System.out.print(STR."\{neg.get(i)} ");
        }
        System.out.println();

        System.out.print(STR."\{pos.size()} ");
        for (int i = 0; i < pos.size(); i++) {
            System.out.print(STR."\{pos.get(i)} ");
        }
        System.out.println();

        System.out.print(STR."\{zero.size()} ");
        for (int i = 0; i < zero.size(); i++) {
            System.out.print(STR."\{zero.get(i)} ");
        }
    }
}
