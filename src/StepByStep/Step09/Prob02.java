// 2501번 약수 구하기
package StepByStep.Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0; // 약수의 순서를 저장할 변수 선언
        int result = 0; // K번째 약수를 저장할 변수 선언

        // 약수 구하는 반복문
        for(int i = 1; i <= N; i++) {
            // 약수가 하나 나올때마다 count에 +1
            if(N % i == 0) {
                count++;
            }
            //count가 K와 같아지면 곧 그 약수가 K번째 약수란 뜻이기에 result에 저장 후 반복문 종료
            if(count == K) {
                result = i;
                break;
            }
        }
        System.out.println(result);

        br.close();
    }
}
