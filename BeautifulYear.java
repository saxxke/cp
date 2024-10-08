//https://codeforces.com/problemset/problem/271/A
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String year = s.next();
            while (true) {
                year = String.valueOf(Integer.parseInt(year) + 1);
                if (year.charAt(0) != year.charAt(1) && year.charAt(0) != year.charAt(2)
                        && year.charAt(0) != year.charAt(3) && year.charAt(1) != year.charAt(2)
                        && year.charAt(1) != year.charAt(3) && year.charAt(2) != year.charAt(3))
                    break;
            }
            System.out.println((year));
        }
    }
}
