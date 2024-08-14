// 2164번 카드2
package WorkBook8078.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int n = 1;

        while (n < N) {
            n *= 2;
        }

        n /= 2;

        if (N == 1)
            System.out.println(1);
        else
            System.out.println((N - n) * 2);

        br.close();
    }
}