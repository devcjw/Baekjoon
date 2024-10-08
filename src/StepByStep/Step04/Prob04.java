// 2562번 최댓값
package StepByStep.Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        sb.append(max).append("\n").append(index);

        System.out.println(sb);

        br.close();
    }
}
