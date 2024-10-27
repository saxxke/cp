//https://codeforces.com/contest/268/problem/A
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                x[i] = s.nextInt();
                y[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (x[i] == y[j])
                        c++;
                }
            }
            System.out.println(c);
        }
    }
}
