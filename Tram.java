//https://codeforces.com/problemset/problem/116/A
import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int in, out, p = 0, min = 0;
            for (int i = 0; i < n; i++) {
                out = s.nextInt();
                in = s.nextInt();
                p += in;
                p -= out;
                if (p > min)
                    min = p;
            }
            System.out.println(min);
        }
    }

}
