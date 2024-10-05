//https://codeforces.com/contest/25/problem/A
import java.util.Scanner;

public class IQtest {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int[] a = new int[t];
            int c = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                if (a[i] % 2 == 0) {
                    c++;
                }
            }
            if (c == 1) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] % 2 == 0) {
                        System.out.println(i + 1);
                    }
                }
            } else {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] % 2 != 0) {
                        System.out.println(i + 1);
                    }
                }
            }
        }
    }
}
