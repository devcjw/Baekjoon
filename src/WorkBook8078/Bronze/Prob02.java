// 5073번 삼각형과 세 변
package WorkBook8078.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;

            if (a + b <= c || a + c <= b || b + c <= a)
                sb.append("Invalid\n");
            else if (a == b && b == c && a == c)
                sb.append("Equilateral\n");
            else if (a == b || b == c || a == c)
                sb.append("Isosceles\n");
            else if (a != b && b != c && a != c)
                sb.append("Scalene\n");
        }
        System.out.println(sb);

        br.close();
    }
}