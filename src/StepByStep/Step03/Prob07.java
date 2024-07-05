// 11021번 A+B - 7
package StepByStep.Step03;

import java.io.*;
import java.util.StringTokenizer;

public class Prob07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.append("Case #").append(String.valueOf(i)).append(": ").append(String.valueOf(A + B)).append("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
