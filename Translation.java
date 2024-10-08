//https://codeforces.com/problemset/problem/41/A
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            String p = s.next();
            StringBuilder i = new StringBuilder();
            if (p.equals(i.append(t).reverse().toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
