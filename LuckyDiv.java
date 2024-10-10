//https://codeforces.com/problemset/problem/122/A
import java.util.Scanner;

public class LuckyDiv {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
         int n  = s.nextInt();
         if(n%4==0 || n%7==0 || n%44==0|| n%47==0 || n%74==0 ||n%77==0 || n%444==0 || n%447==0 || n%474==0 || n%744==0 || n%477==0 || n%747==0 || n%774==0 || n%777==0 )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
