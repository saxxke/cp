//https://codeforces.com/problemset/problem/200/B
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int m =0;
            for (int i = 0; i < t; i++) {
                m+=s.nextInt();
            }
            System.out.printf("%.12f",(double)m /t);
        }
    }
}
