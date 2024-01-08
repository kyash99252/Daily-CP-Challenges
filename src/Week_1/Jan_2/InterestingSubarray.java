package Week_1.Jan_2;

// Date - January 2, 2024
// Platform - CodeChef
// Problem Name - Interesting Subarray
// Problem Link - https://www.codechef.com/problems/SUBARRY?tab=statement
// Submission Link - https://www.codechef.com/viewsolution/1038049736
// Time Complexity - O(nlogn)
// Space Complexity - O(n)

import java.util.*;
import java.lang.*;
import java.io.*;

class InterestingSubarray
{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            fillArr(a, n);
            Arrays.sort(a);
            long minPos = a[0] * a[0];
            long maxPos = a[n - 1] * a[n - 1];
            long min = Math.min(minPos, Math.min((a[0] * a[n - 1]), maxPos));
            long max = Math.max(minPos, maxPos);
            System.out.println(min + " " + max);
        }
    }
	public static void fillArr(long[] a, long n) {
	    for (int i = 0; i < n; i++) {
	        a[i] = sc.nextLong();
	    }
	}
}
