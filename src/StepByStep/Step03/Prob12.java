// 10951번 A+B - 4
package StepByStep.Step03;

import java.io.*;
import java.util.StringTokenizer;

public class Prob12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");
        }
        System.out.print(sb);

        br.close();
    }
}
