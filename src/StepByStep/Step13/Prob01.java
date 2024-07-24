// 2750번 수 정렬하기
package StepByStep.Step13;

import java.io.*;
import java.util.*;

public class Prob01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}