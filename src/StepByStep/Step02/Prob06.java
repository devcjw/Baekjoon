// 2525번 오븐 시계
package StepByStep.Step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 17
        int B = Integer.parseInt(st.nextToken()); // 40
        int C = Integer.parseInt(br.readLine()); // 80

        br.close();

        int min = 60 * A + B;
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
