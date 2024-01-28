package Jan_2024.Week_3.Jan_14;

import java.util.HashSet;
import java.util.Scanner;

public class PerfectlyBalancedString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            HashSet<Character> set = new HashSet<>();
            boolean flag = true;
            int k = 0;
            for (char ch: s.toCharArray()) {
                if (!set.contains(ch)) {
                    set.add(ch);
                    ++k;
                } else {
                    break;
                }
            }
            for (int i = k; i < n; ++i) {
                if (s.charAt(i) != s.charAt(i - k)) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
