//https://codeforces.com/problemset/problem/266/A
import java.util.Scanner;

public class stonesontable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int c = 0;
            String words = sc.next();
            char first = words.charAt(0);
            for (int j = 1; j < n; j++) {
                if (words.charAt(j) == first) {
                    c++;
                } else {
                    first = words.charAt(j);
                }

            }
            System.out.println(c);
        }
    }

}