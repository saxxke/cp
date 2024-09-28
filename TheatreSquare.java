//https://codeforces.com/problemset/problem/1/A
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            double n = sc.nextInt();
            double m = sc.nextInt();
            double a = sc.nextInt();
            System.out.println((long) (Math.ceil(n / a) * Math.ceil(m / a)));
        }
    }
}