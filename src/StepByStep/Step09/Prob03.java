// 9506번 약수들의 합
package StepByStep.Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            int result = 0;

            if (n == -1)
                break;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    result += i;
                }
            }

            if (result == n) {
                sb.append(n).append(" = ");
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        sb.append(i).append(" + ");
                    }
                }
                sb.setLength(sb.length() - 3);
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }
        System.out.println(sb);

        br.close();
    }
}