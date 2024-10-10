//https://codeforces.com/problemset/problem/318/A
import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long n = s.nextLong();
            long k = s.nextLong();
            if (k <= (n + 1) / 2) {
                System.out.println(k * 2 - 1);
            } else {
                System.out.println((k - (n + 1) / 2) * 2);
            }
        }
    }
}
