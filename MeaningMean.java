//https://codeforces.com/contest/2021/problem/A
import java.util.Arrays;
import java.util.Scanner;

public class MeaningMean {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                int[] a = new int[n];
                for (int j = 0; j < n; ++j) {
                    a[j] = scanner.nextInt();
                }
                Arrays.sort(a);
                int result = a[0];
                for (int k = 1; k < n; ++k) {
                    result = (result + a[k]) / 2;
                }
                System.out.println(result);
            }
        }
    }
}