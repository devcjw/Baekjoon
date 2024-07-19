// 24264번 알고리즘 수업 - 알고리즘의 수행 시간 3
package StepByStep.Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        // 시간 복잡도: O(n^2)
        System.out.println(n * n);
        System.out.println(2);

        br.close();
    }
}