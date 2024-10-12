//https://codeforces.com/problemset/problem/705/A
import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        int m, i;
        try (Scanner s = new Scanner(System.in)) {
            m = s.nextInt();
        }
        for (i = 0; i < m; i++) {
            if (i % 2 == 0) {
                System.out.print("I hate ");
            } else {
                System.out.print("I love ");
            }
            if (i != (m - 1)) {
                System.out.print("that ");
            } else {
                System.out.print("it ");
            }
        }
    }
}