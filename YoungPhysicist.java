//https://codeforces.com/problemset/problem/69/A
import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int sumX = 0, sumY = 0, sumZ = 0;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                int y = s.nextInt();
                int z = s.nextInt();
                sumX += x;
                sumY += y;
                sumZ += z;
            }
            if (sumX == 0 && sumY == 0 && sumZ == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
