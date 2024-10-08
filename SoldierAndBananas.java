//https://codeforces.com/contest/546/problem/A
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int k = s.nextInt();
            int n = s.nextInt();
            int w = s.nextInt();
            int o = ((w * (w + 1)) / 2) * k - n;
            if (o < 0)
                System.out.println(0);

            else
                System.out.println(o);
        }
    }
}