// 10818번 최소, 최대
package StepByStep.Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int min = 1000000;
        int max = -1000000;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
//            if (arr[i] > max)
//                max = arr[i];
//            if (arr[i] < min)
//                min = arr[i];
        }
        sb.append(min).append(" ").append(max);

        System.out.println(sb);

        br.close();
    }
}
