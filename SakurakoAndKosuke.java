//https://codeforces.com/contest/2033/problem/A
import java.util.Scanner;
public class SakurakoAndKosuke{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-->0){
                int n = s.nextInt();
                if (n % 2 ==0)  System.out.println("Sakurako");
                else System.out.println("Kosuke");
            }
        }
    }
}