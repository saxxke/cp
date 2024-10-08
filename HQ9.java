//https://codeforces.com/problemset/problem/133/A
import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            if (t.contains("H") || t.contains("Q") || t.contains("9") ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
