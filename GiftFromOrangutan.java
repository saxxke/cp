//https://codeforces.com/contest/2030/problem/A
import java.util.Arrays;
import java.util.Scanner;

public class GiftFromOrangutan {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt(); 
            while (t-- > 0) {
                int n = s.nextInt(); 
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }
                Arrays.sort(a);
                int score = (n-1)*(a[n-1]-a[0]);
               
                System.out.println(score);
            }
        }
    }
}
