//https://codeforces.com/contest/118/problem/A
import java.util.Scanner;
public class StringTask 
{
    public static void main(String []args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next().toLowerCase().replaceAll("[aeiouyAEIOUY]", "");
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                sb.append(".");
                sb.append(s.charAt(i));
            }
            System.out.println(sb);
        }
    }
}