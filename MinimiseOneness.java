//https://codeforces.com/contest/2030/problem/B
import java.util.Scanner;

public class MinimiseOneness {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                if (n == 1) {
                    System.out.println("0");
                } else {
                    String result = "0"+"1"+"0".repeat(n-2);
                    System.out.println(result);
                }
            }
        }
    }
}
