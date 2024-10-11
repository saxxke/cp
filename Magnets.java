//https://codeforces.com/problemset/problem/344/A
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int c = 0;
            int[] a = new int[t];
            for (int i = 0; i < t; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 1; i < t; i++) {
                if (a[i - 1] != a[i]) {
                    c++;
                }
            }
                System.out.println(c + 1);
        }
    }
}