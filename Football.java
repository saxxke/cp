//https://codeforces.com/problemset/problem/96/A
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            if (t.contains("1111111") || t.contains("0000000")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
