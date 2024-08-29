// 21921번 블로그
package WorkBook8078.Silver;

import java.io.*;
import java.util.*;

public class Prob17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] result = new int[N];
        int[] sum = new int[N + 1];

        // 방문자 수 입력 및 누적 합 계산
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            result[i] = Integer.parseInt(st.nextToken());
            sum[i + 1] = sum[i] + result[i];
        }

        // 첫 번째 구간의 최대 방문자 수 계산
        int maxSum = sum[X] - sum[0];
        int count = 1;  // 초기 구간의 개수는 1

        // 구간을 이동하며 최대 방문자 수 계산
        for (int j = 1; j <= N - X; j++) {
            int currentSum = sum[X + j] - sum[j];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                count = 1;  // 새로운 최대 방문자 수가 나왔으므로 개수는 1로 초기화
            } else if (currentSum == maxSum) {
                count++;  // 최대 방문자 수와 같은 구간이 추가로 나왔으므로 개수를 증가
            }
        }

        // 최대 방문자 수가 0일 경우 "SAD" 출력, 그렇지 않으면 최대 방문자 수와 구간 개수 출력
        if (maxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxSum);
            System.out.println(count);
        }
    }
}
