//https://codeforces.com/problemset/problem/160/A
import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int[] a = new int[t];
            int v = 0;
            for (int i = 0; i < t; i++) {
                a[i] = s.nextInt();
                v += a[i];
            }
            v = v / 2;
            int c = 0;
            int m = 0;
            Arrays.sort(a);
            for (int j = t - 1; j > 0; j--) {
                c += a[j];
                if (c > v)
                    break;
                else
                    m++;
            }
            System.out.println(m+1);
        }

    }
}
