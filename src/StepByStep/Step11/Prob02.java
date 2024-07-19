// 24263번 알고리즘 수업 - 알고리즘의 수행 시간 2
package StepByStep.Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 시간 복잡도: O(n)
        System.out.println(n);
        System.out.println(1);

        br.close();
    }
}
