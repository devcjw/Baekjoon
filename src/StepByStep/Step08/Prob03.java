// 2720번 세탁소 사장 동혁
package StepByStep.Step08;

import java.io.*;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int quarter = 25;  // 쿼터 0.25$
        int dime = 10;  // 다임 0.10$
        int nickel = 5;  // 니켈 0.05$
        int penny = 1;  // 페니 0.01$

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C / quarter + " ");
            C %= quarter;
            sb.append(C / dime + " ");
            C %= dime;
            sb.append(C / nickel + " ");
            C %= nickel;
            sb.append(C / penny + "\n");
        }
        System.out.print(sb);

        br.close();
    }
}