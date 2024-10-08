//https://codeforces.com/problemset/problem/263/A
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int i;
            int j = 1;
            for (i = 1; i <= 5; i++) {
                if (s.nextInt() == 1) {
                    break;
                }
                if (i == 5) {
                    j++;
                    i = 0;
                }
            }
            System.out.println(Math.abs(i - 3) + Math.abs(j - 3));
        }
    }
}
