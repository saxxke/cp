//https://codeforces.com/contest/2014/problem/A
import java.util.Scanner;
public class RobinHelps {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] a = new int[n];
                for (int j = 0; j < n; j++) {
                    a[j] = scanner.nextInt();
                }
                int c = 0;
                int d = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] >= k) {
                        c += a[j]; 
                    } else if (a[j] == 0 && c > 0) {
                        d++; 
                        c--; 
                    }
                }
                    System.out.println(d);
            }
        }
    }
}
