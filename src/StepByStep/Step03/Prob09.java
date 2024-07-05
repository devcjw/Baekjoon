// 2438번 별 찍기 - 1
package StepByStep.Step03;

import java.io.*;

public class Prob09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.close();
    }
}

// bw.flush()를 하지 않아도 되는 이유
// - 개행 문자('\n')가 쓰여질 때 자동으로 flush 되기 때문