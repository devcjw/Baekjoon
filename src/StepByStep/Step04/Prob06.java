// 10813 공 바꾸기
package StepByStep.Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int temp;

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine(), " ");

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            temp = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = temp;
        }

        for (int k = 0; k < arr.length; k++)
            sb.append(arr[k]).append(" ");

        System.out.println(sb);

        br.close();
    }
}
