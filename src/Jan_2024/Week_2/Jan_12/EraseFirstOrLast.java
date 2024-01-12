package Jan_2024.Week_2.Jan_12;

import java.util.Scanner;
import java.util.Arrays;

public class EraseFirstOrLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            long[] ans = new long[n];
            Arrays.fill(ans, 0);
            int[] nxt = new int[26];
            Arrays.fill(nxt, n);
            ans[n - 1] = 1;
            nxt[s.charAt(n - 1) - 'a'] = n - 1;
        
            for (int i = n - 2; i >= 0; i--) {
                ans[i] = ans[i + 1] + (nxt[s.charAt(i) - 'a'] - i);
                nxt[s.charAt(i) - 'a'] = i;
            }
        
            System.out.println(ans[0]);
        }
    }
}
