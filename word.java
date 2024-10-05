//https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            String u = t.toUpperCase();
            String l = t.toLowerCase();
            char[] arr = t.toCharArray();
            char[] arru = u.toCharArray();
            char[] arrl = l.toCharArray();
            int cu = 0;
            int cl = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arru[i]) {
                    cu++;
                }
                if (arr[i] == arrl[i]) {
                    cl++;
                }
            }
            if (cl > cu || cl == cu) {
                System.out.println(l);
            } else {
                System.out.println(u);
            }
        }
    }
}
