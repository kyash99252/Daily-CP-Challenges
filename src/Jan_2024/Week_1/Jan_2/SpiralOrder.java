package Jan_2024.Week_1.Jan_2;

// Date - January 2, 2024
// Platform - LeetCode
// Problem Name - Spiral Matrix
// Problem Link - https://leetcode.com/problems/spiral-matrix/
// Submission Link - https://leetcode.com/submissions/detail/1134434951/
// Time Complexity - O(m * n)
// Space Complexity - O(m + n)

import java.util.*;
class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        int switchDirection = 0;
        int i = 0;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        while (list.size() != (m * n)) {
            list.add(matrix[i][j]);
            set.add(i + "," + j);
            if (switchDirection == 0) {
                if (j + 1 < n && !set.contains(i + "," + (j + 1))) {
                    j++;
                } else {
                    switchDirection = 1;
                    i++;
                }
            } else if (switchDirection == 1) {
                if (i + 1 < m && !set.contains((i + 1) + "," + j)) {
                    i++;
                } else {
                    switchDirection = 2;
                    j--;
                }
            } else if (switchDirection == 2) {
                if (j - 1 >= 0 && !set.contains(i + "," + (j - 1))) {
                    j--;
                } else {
                    switchDirection = 3;
                    i--;
                }
            } else if (switchDirection == 3) {
                if (i - 1 >= 0 && !set.contains((i - 1) + "," + j)) {
                    i--;
                } else {
                    switchDirection = 0;
                    j++;
                }
            }
        }
        return list;
    }
}