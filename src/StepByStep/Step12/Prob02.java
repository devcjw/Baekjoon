// 2231번 분해합
package StepByStep.Step12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();

        int N_len = a.length();
        int N = Integer.parseInt(a);
        int result = 0;

        for (int i = (N - (N_len * 9)); i < N; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }

        }
        System.out.println(result);

        br.close();
    }
}