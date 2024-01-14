package Jan_2024.Week_2.Jan_13;

// Date - January 13, 2024
// Platform - LeetCode
// Problem Name - Minimum Time to Complete All Tasks
// Problem Link - https://leetcode.com/problems/minimum-time-to-complete-all-tasks/description/
// Submission Link - https://leetcode.com/submissions/detail/1146190031/
// Time Complexity - O(n^2)
// Space Complexity - O(n)

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class FindMinimumTime {
    public int findMinimumTime(int[][] tasks) {
        Set<Integer> runSet = new HashSet<>();
        Arrays.sort(tasks, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] != b[1]) {
                    return a[1] - b[1];
                } else if (a[0] != b[0]) {
                    return a[0] - b[0];
                } else {
                    return b[2] - a[2];
                }
            }
        });
        for (int i = 0; i < tasks.length; i++) {
            int start = tasks[i][0];
            int end = tasks[i][1];
            int duration = tasks[i][2];
            int run = end;
            while (duration > 0) {
                if (!runSet.contains(run)) {
                    runSet.add(run);
                    duration--;
                    for (int j = i + 1; j < tasks.length; j++) {
                        if (tasks[j][0] <= run) {
                            tasks[j][2]--;
                        }
                    }
                }
                run--;
            }
        }
        return runSet.size();
    }
}
