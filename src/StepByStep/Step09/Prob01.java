// 5086번 배수와 약수
package StepByStep.Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 == 0 && num2 == 0)
                break;

            if (num2 % num1 == 0)
                sb.append("factor").append("\n");
            else if (num1 % num2 == 0)
                sb.append("multiple").append("\n");
            else
                sb.append("neither").append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}