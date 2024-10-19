//https://codeforces.com/problemset/problem/1807/A
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int a = s.nextInt();
                int b = s.nextInt();
                int d = s.nextInt();
                if (a + b == d)
                    System.out.println("+");
                else
                    System.out.println("-");
            }
        }
    }
}