//https://codeforces.com/problemset/problem/50/A
import java.util.Scanner;

public class DominoPiling {
    public static void main(String args[]) {
        try (Scanner i = new Scanner(System.in)) {
            double a = i.nextInt();
            double b = i.nextInt();
            double c = a * b;
            System.out.println((int) Math.floor(c / 2));
        }
    }
}