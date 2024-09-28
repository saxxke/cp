//https://codeforces.com/problemset/problem/158/A
import java.util.Scanner;

public class nextround {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int k = s.nextInt();
            int c = 0;
            int[] arr = new int[50];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0 && arr[i] >= arr[k-1]) {
                    c++;
                }
            }
                System.out.print(c);
        }

        
    }
}
