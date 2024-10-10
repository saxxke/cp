//https://codeforces.com/problemset/problem/58/A
import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String p = s.nextLine();
            String m = "hello";
            int count = 0;
            for (int i = 0; i < p.length(); i++) {
                if (count == m.length())
                    break;
                if (p.charAt(i) == m.charAt(count))
                    count++;
            }
            if (count >= 5)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}