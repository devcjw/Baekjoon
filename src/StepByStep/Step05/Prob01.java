// 27866번 문자와 문자열
package StepByStep.Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine()) - 1;

        System.out.println(S.charAt(i));

        br.close();
    }
}