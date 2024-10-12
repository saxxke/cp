//https://codeforces.com/problemset/problem/785/A
import java.util.Scanner;

public class AntonPolyhedrons {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int c = 0;
            while (t-- > 0) {
                String p = s.next();
                if (p.equals("Tetrahedron"))
                    c += 4;
                if (p.equals("Cube"))
                    c += 6;
                if (p.equals("Octahedron"))
                    c += 8;
                if (p.equals("Dodecahedron"))
                    c += 12;
                if (p.equals("Icosahedron"))
                    c += 20;
            }
            System.out.println(c);
        }

    }
}
