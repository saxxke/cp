import java.util.Scanner;

public class BattleofSurvive{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                int[] s = new int[n];
                for (int i = 0; i < n; i++) {
                    s[i] = scanner.nextInt();
                }
                int  m  = s [n-2];
                for (int i = 0; i < n-2; i++) {
                    m -=s[i];
                }
                System.out.print(s[n-1]-m +"\n");
            }
        }
    }
}
