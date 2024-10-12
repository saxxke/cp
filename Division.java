//https://codeforces.com/contest/1669/problem/A
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            while (n-- > 0) {
                int t = s.nextInt();
                if (t <= 1399)
                    System.out.println("Division 4");
                else if (t >= 1400 && t <= 1599)
                    System.out.println("Division 3");
                else if (t >= 1600 && t <= 1899)
                    System.out.println("Division 2");
                else
                    System.out.println("Division 1");
            }
        }
    }
}
