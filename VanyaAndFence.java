//https://codeforces.com/problemset/problem/677/A
import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int h = s.nextInt();
            int c = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                if (a[i] > h)
                    c++;
            }
            System.out.println(n + c);
        }
    }
}