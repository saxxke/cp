
import java.util.*;

public class RobinTown {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                List<Long> v = new ArrayList<>(n);
                for (int i = 0; i < n; i++) {
                    v.add(scanner.nextLong());
                }
                Collections.sort(v);
                long  l = 0, r = 2000000, x = -1;
                while (l <= r) {
                    long rich = l + (r - l) / 2;
                    List<Long> b = new ArrayList<>(v);
                    b.set(n - 1, b.get(n - 1) + rich);
                    double sum = b.stream().mapToDouble(Long::doubleValue).sum();
                    double avgWealth = sum / n;
                    long counter = 0;
                    for (long wealth : b) {
                        if (wealth < avgWealth / 2)
                            counter++;
                    }
                    if (counter > n / 2) {
                        x = rich;
                        r = rich - 1;
                    } else {
                        l = rich + 1;
                    }
                }
                System.out.println(x);
            }
        }
    }
}