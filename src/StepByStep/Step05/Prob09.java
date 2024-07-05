// 2908번 상수
package StepByStep.Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        // reverse()는 StringBuilder 객체를 반환하며, Integer.parseInt는 문자열을 요구한다.
        // 따라서, 문자열로 변환하기 위해 toString()을 호출해야 한다.

        System.out.print(A > B ? A : B);

        br.close();

    }
}