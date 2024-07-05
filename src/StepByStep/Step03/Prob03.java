// 8393번 합
package StepByStep.Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        br.close();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
