//https://codeforces.com/problemset/problem/1030/A
import java.util.Scanner;

public class InSearchOfEasy {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int[] a = new int[t];
            int c = 0;
            for (int i = 0; i < t; i++) {
                a[i] = s.nextInt();
                if (a[i] == 1)
                    c++;
            }
            if (c != 0) {
                System.out.println("HARD");
            } else {
                System.out.println("EASY");
            }
        }
    }
}