// 3052번 나머지
package StepByStep.Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1001];

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine()) % 42;
            arr[a]++;
        }

        int cnt = 0;

        for (int i = 0; i <= 1000; i++) {
            if (arr[i] > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);

        br.close();
    }
}
