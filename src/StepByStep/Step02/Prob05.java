// 2884번 알람 시계
package StepByStep.Step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        br.close();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0)
                H = 23;
            System.out.println(H + " " + M);
        } else
            System.out.println(H + " " + (M - 45));
    }
}
