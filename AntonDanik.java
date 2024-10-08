//https://codeforces.com/problemset/problem/734/A
import java.util.Scanner;

public class AntonDanik {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            @SuppressWarnings("unused")
            int n = s.nextInt();
            String p = s.next();
            int c = 0;
            int d = 0;
            char[] a = p.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 'A') {
                    c++;
                }
                if (a[i] == 'D') {
                    d++;
                }
            }
            if (c == d) {
                System.out.println("Friendship");
            } else if (c > d) {
                System.out.println("Anton");
            } else {
                System.out.println("Danik");
            }
        }

    }
}
