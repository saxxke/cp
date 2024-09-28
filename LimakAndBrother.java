//https://codeforces.com/problemset/problem/791/A
import java.util.Scanner;

public class LimakAndBrother {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int limak = sc.nextInt();
            int bob = sc.nextInt();
            int year = 0;
            while (limak <= bob) {
                limak = limak * 3;
                bob = bob * 2;
                year++;
            }
            System.out.println(year);
        }

    }
}