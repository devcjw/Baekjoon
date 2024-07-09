// 2444번 별 찍기 - 7
package StepByStep.Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * n - 1; i++) {
            sb.append(" ".repeat(Math.abs(n - i))); // Math.abs는 절댓값 구할 때 사용, repeat()는 주어진 횟수만큼 반복
            sb.append("*".repeat((n - Math.abs(n - i)) * 2 - 1));
            sb.append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}