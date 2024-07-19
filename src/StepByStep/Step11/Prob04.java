// 24265번 알고리즘 수업 - 알고리즘의 수행 시간 4
package StepByStep.Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        // 시간복잡도: O(n^2)
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);

        br.close();
    }
}