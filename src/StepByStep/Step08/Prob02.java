// 11005번 진법 변환2
package StepByStep.Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        //대문자 65~90
        while (N != 0) {
            if (N % B >= 10) sb.append((char) ((N % B) + 55));
            else sb.append(N % B);
            N /= B;
        }
        System.out.println(sb.reverse().toString());

        br.close();
    }
}