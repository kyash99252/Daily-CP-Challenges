package Week_2.Jan_8;

// Date - January 8, 2024
// Platform - Coding Ninjas Studio
// Problem Name - Allocate Books
// Problem Link - https://www.codingninjas.com/studio/problems/allocate-books_1090540
// Time Complexity - O(nlogm)
// Space Complexity - O(1)

import java.util.ArrayList;
import java.util.Collections;

public class FindPages {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n) return -1;
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    public static int countStudents(ArrayList<Integer> arr, int pages) {
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                pagesStudent += arr.get(i);
            } else {
                students += 1;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }
}
