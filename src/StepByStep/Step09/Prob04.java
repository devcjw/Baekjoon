// 1978번 소수 찾기
package StepByStep.Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        br.readLine();

        int count = 0;

        while (st.hasMoreTokens()) {
            boolean isPrime = true; // 소수인 경우 true, 아닌 경우 false

            int num = Integer.parseInt(st.nextToken());

            if (num == 1)
                continue;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                count++;
        }
        System.out.println(count);

        br.close();
    }
}