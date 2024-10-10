//https://codeforces.com/problemset/problem/467/A
import java.util.Scanner;

public class GeorgeAccomodarion {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int c = 0;
            for (int i = 0; i < t; i++) {
                int n = s.nextInt();
                int m = s.nextInt();
                if (m - n>=2) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
