//https://codeforces.com/problemset/problem/1742/A
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                if (a == b + c || b == a + c || c == a + b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }
}
