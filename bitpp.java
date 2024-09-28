//https://codeforces.com/contest/282/problem/A
import java.util.Scanner;

public class bitpp {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int x = 0;
            for (int i = 0; i < t; i++) {
                String u = s.next();
                if (u.charAt(1) == '+') {
                    x++;
                } else {
                    x--;
                }
            }
            System.out.println(x);
        }
    }
}
