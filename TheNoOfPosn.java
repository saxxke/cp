//https://codeforces.com/contest/124/problem/A
import java.util.*;

public class TheNoOfPosn {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long n = s.nextInt();
            long a = s.nextInt();
            long b = s.nextInt();
            System.out.println(Math.min(n - a, b + 1));
        }
    }
}
