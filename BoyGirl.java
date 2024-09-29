//https://codeforces.com/contest/236/problem/A
import java.util.Arrays;
import java.util.Scanner;

public class BoyGirl {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            int count = 1;
            char[] c = t.toCharArray();
            Arrays.sort(c);
            for (int i = 1; i < c.length; i++)
                if (c[i - 1] != c[i])
                    ++count;
            if (count % 2 == 0)
                System.out.println("CHAT WITH HER!");
            else
                System.out.println("IGNORE HIM!");
        }
    }
}
