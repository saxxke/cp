//https://codeforces.com/problemset/problem/2009/A
import java.util.Scanner;

public class minimize {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
               int a = sc.nextInt();
               int b = sc.nextInt(); 
               int z = b-a;
               System.out.println(z);
            }
       
        }
    }
}