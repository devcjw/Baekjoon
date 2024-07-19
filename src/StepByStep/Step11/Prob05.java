// 24266번 알고리즘 수업 - 알고리즘의 수행 시간 5
package StepByStep.Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        // 시간복잡도: O(n^3)
        System.out.println(n * n * n);
        System.out.println(3);

        br.close();
    }
}
