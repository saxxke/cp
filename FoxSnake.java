//https://codeforces.com/problemset/problem/510/A
import java.util.Scanner;

public class FoxSnake {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int o = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("#");
                    }
                } else {
                    o++;
                    for (int j = 0; j < m; j++) {
                        if (o % 2 == 1 && j == m - 1) {
                            System.out.print("#");
                        } else if (o % 2 == 0 && j == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
