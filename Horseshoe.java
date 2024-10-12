//https://codeforces.com/problemset/problem/228/A
import java.util.Arrays;
import java.util.Scanner;

public class Horseshoe {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] a = new int[4];
            int c = 0;
            for (int i = 0; i < 4; i++) {
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < 3; i++) {
                if (a[i] == a[i + 1])
                    c++;
            }
            System.out.println(c);
        }
    }
}