//https://codeforces.com/contest/281/problem/A
import java.util.Scanner;

public class WordCapitalisation {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            System.out.println(Character.toUpperCase(t.charAt(0)) + t.substring(1, t.length()));
        }
    }
}