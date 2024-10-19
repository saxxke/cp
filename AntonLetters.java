//https://codeforces.com/problemset/problem/443/A
import java.util.HashSet;
import java.util.Scanner;

public class AntonLetters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            HashSet<Character> a = new HashSet<>();
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    a.add(s.charAt(i));
                }
            }
            
            System.out.println(a.size());
        }
    }
}

