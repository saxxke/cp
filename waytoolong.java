//https://codeforces.com/problemset/problem/71/A
import java.util.Scanner;

public class waytoolong {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n;
            n = input.nextInt();
            String[] words = new String[n + 1];
            for (int i = 0; i < n + 1; i++) {
                words[i] = input.nextLine();
            }

            for (int j = 0; j < n + 1; j++) {
                if (words[j].length() < 11) {
                    System.out.print(words[j]);
                }

                else {
                    System.out.print(words[j].charAt(0));
                    System.out.print(words[j].length() - 2);
                    System.out.print(words[j].charAt(words[j].length() - 1));
                }

                System.out.print("\n");
            }
        }

    }

}