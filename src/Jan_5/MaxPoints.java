package Jan_5;

// Date - January 5, 2024
// Platform - LeetCode
// Problem Name - Max Points on a Line
// Problem Link - https://leetcode.com/problems/max-points-on-a-line/
// Submission Link - https://leetcode.com/submissions/detail/1137589495/
// Time Complexity - O(n^3)
// Space Complexity - O(1)

class MaxPoints {
    public int maxPoints(int[][] points) {
        int ans = 2;
        if (points.length < 3) {
            return points.length;
        } else {
            for (int i = 0; i < points.length; ++i) {
                for (int j = i + 1; j < points.length; ++j) {
                    int count = 2;
                    for (int k = 0; k < points.length; ++k) {
                        if (k == i || k == j)
                            continue;
                        int p1 = (points[i][0] * (points[j][1] - points[k][1]));
                        int p2 = (points[j][0] * (points[k][1] - points[i][1]));
                        int p3 = (points[k][0] * (points[i][1] - points[j][1]));

                        if (p1 + p2 + p3 == 0) {
                            ++count;
                        }
                    }
                    ans = Math.max(ans, count);
                }
            }
            return ans;
        }
    }
}