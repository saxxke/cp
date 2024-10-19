//https://codeforces.com/contest/2030/problem/C
import java.util.Scanner;

public class ATrueBattle{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt(); 
            while (t-- > 0) {
                int n = s.nextInt();
                 String m =s.next();
                 char[] p = m.toCharArray();
                if(p[0]=='1'||p[n-1]=='1'||m.contains("11")) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
