import java.util.ArrayList;
import java.util.Scanner;

public class SakurakoKosukePermutation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                ArrayList<Integer> p = new ArrayList<>(n);
                for (int i = 0; i < n; i++) {
                    p.add(0);
                }
                for (int i = 0; i < n; i++) {
                    p.set(i, scanner.nextInt());
                }
                boolean[] v = new boolean[n];
                int ans = 0;
                for (int i = 1; i < n; i++) {
                    if (!v[i]) {
                        int j = i;
                        int c = 0;
                        while (!v[j]) {
                            v[j] = true;
                            j = p.get(j) - 1;
                            c++;
                        }
                        ans += (c - 1) / 2;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}

