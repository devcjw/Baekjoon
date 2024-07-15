// 2903번 중앙 이동 알고리즘
package StepByStep.Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // Math.pow(밑, 지수)
        System.out.println((int) Math.pow(Math.pow(2, N) + 1, 2));

        br.close();
    }
}