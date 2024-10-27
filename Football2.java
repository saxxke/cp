//https://codeforces.com/contest/43/problem/A
import java.util.Scanner;

public class Football2 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            String[] a = new String[n];
            s.nextLine();
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLine();
            }
            int k = 0, sum1 = 1, sum2 = 0;
            for (int i = 1; i < n; i++) {
                if (a[0].equals(a[i]))
                    sum1++;
                else {
                    sum2++;
                    k = i;
                }

            }
            if (sum1 > sum2)
                System.out.printf("%s\n", a[0]);
            else
                System.out.printf("%s\n", a[k]);
        }
    }
}
