//https://codeforces.com/contest/2014/problem/B
import java.util.Scanner;

public class RobinOak {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt(); 
            for (int i = 0; i < t; i++) {
                long n = scanner.nextLong(); 
                long k = scanner.nextLong(); 
                long leaf = n * (n + 1) / 2;
                long Fall = 0;
               if (n>=k){
              Fall = (n-k)*(n-k+1)/2;
               }
                long rest = leaf - Fall;
                if (rest % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
