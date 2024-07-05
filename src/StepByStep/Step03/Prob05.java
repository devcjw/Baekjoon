// 25314번 코딩을 체육과목 입니다
package StepByStep.Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();

        for (int i = 0; i < N / 4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
