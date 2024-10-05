//https://codeforces.com/problemset/problem/208/A
import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            System.out.println(t.replaceAll("WUB", " ").replaceAll(" +", " "));
        }
    }
}
