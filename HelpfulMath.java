//http://codeforces.com/problemset/problem/339/A
import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMath {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            t = t.replace("+", "");
            char[] arr = t.toCharArray();
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i == arr.length - 1)
                    continue;
                System.out.print("+");
            }
        }
        System.out.println();
    }
}