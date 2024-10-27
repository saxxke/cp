//https://codeforces.com/contest/339/problem/B
import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[] a = new int[m];
            long c = 1;
            long ans = 0;
            for (int i = 0; i < m; i++) {
                a[i] = s.nextInt();
                if(a[i]>=c) ans +=a[i]-c;
                else ans += n-(c-a[i]);
                c=a[i];
            }
            System.out.println(ans);
        }
    }
}