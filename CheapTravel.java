//https://codeforces.com/contest/466/problem/A
import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            if(m*a<=b){
                System.out.println(n*a);
            }
            else{
                System.out.println((n/m) * b + Math.min((n%m) * a, b));
            }
        }
    }
}
