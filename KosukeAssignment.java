import java.util.HashMap;
import java.util.Scanner;

public class KosukeAssignment {
     public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long t = s.nextLong();
            while (t-- > 0) {
                long n = s.nextLong();
                HashMap<Long,Long> p = new HashMap<>();
                p.put(0L, 0L);
                long sum = 0;
                long ans = 0;
                for (long i = 0; i < n; i++) {
                    sum += s.nextLong();
                    if (!p.containsKey(sum)) {
                        p.put(sum, i);
                        continue;
                    }
                    ans++;
                    p.clear();
                    p.put(sum, i);
                }
                System.out.println(ans);
            }
        }
    }
}
