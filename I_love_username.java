//https://codeforces.com/problemset/problem/155/A
import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int[] a = new int[t];
            int c = 0;
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                if (i == 0) {
                    min = a[i];
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                    c++;
                }
                if (a[i] > max) {
                    max = a[i];
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}