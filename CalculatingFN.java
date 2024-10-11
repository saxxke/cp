//https://codeforces.com/problemset/problem/486/A
import java.util.Scanner;

public class CalculatingFN {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long t = s.nextLong();
            if (t%2==0) System.out.println(t/2);
            else System.out.println(-t/2-1);
        }
    }
}
