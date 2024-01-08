package Week_1.Jan_5;

// Date - January 5, 2024
// Platform - CodeForces
// Problem Name - Collecting Game
// Problem Link - https://codeforces.com/problemset/problem/1904/B
// Submission Link - https://codeforces.com/contest/1904/submission/240366015
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.*;
import java.io.*;

public class CollectingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tt = 1; tt <= T; tt++){
            int n = Integer.parseInt(br.readLine());
            Pair[] arr = new Pair[n + 1];
            String[] inputs = br.readLine().split(" ");
            for(int i = 1; i <= n; i++) {
                arr[i] = new Pair(Integer.parseInt(inputs[i-1]), i);
            }
            Arrays.sort(arr, 1, n + 1);
            int[] nxt = new int[n + 1];
            long[] sum = new long[n + 1];
            int[] ans = new int[n + 1];
            nxt[0] = 0;
            sum[0] = 0;
            for(int i = 1; i <= n; i++){
                if(nxt[i - 1] >= i){
                    nxt[i] = nxt[i - 1];
                    sum[i] = sum[i - 1];
                } else {
                    sum[i] = sum[i - 1] + arr[i].first;
                    nxt[i] = i;
                    while(nxt[i] + 1 <= n && sum[i] >= arr[nxt[i] + 1].first){
                        nxt[i]++;
                        sum[i] += arr[nxt[i]].first;
                    }
                }
                ans[arr[i].second] = nxt[i];
            }
            for(int i = 1; i <= n; i++) System.out.print((ans[i] - 1) + " ");
            System.out.println();
        }
    }
}

class Pair implements Comparable<Pair> {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair p) {
        return this.first - p.first;
    }
}
