package Jan_2024.Week_2.Jan_9;

// Date - January 9, 2024
// Platform - GeeksforGeeks
// Problem Name - Longest K unique characters substring
// Problem Link - https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Time Complexity - O(n)
// Space Complexity - O(1)

import java.util.HashMap;
import java.util.Map;

class LongestkSubstr {
    public int longestkSubstr(String s, int k) {
        // code here
        int i = 0;
        int j = 0;
        int n = s.length();
        int max = -1;
        
        if (s == null || s.length() == 0 || k <= 0) {
                return -1;
        }
    
        Map<Character, Integer> map = new HashMap<>();
    
        while (j < n) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
    
            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}