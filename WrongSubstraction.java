//https://codeforces.com/problemset/problem/977/A
import java.util.Scanner;

public class WrongSubstraction {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int k = s.nextInt();
            while (k-- > 0) {
                if (n % 10 == 0) {
                    n = n / 10;
                } else {
                    n--;
                }
            }
            System.out.println(n);
        }
    }
}
