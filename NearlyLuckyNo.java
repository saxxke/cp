//https://codeforces.com/problemset/problem/110/A
import java.util.Scanner;

public class NearlyLuckyNo {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String t = s.next();
            int c = 0;
            for(int i=0; i<t.length(); i++)
    		if(t.charAt(i)=='4' || t.charAt(i)=='7')
    		    c++;
            if (c == 7 || c == 4)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
