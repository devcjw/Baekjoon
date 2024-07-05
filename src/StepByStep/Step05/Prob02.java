// 2743번 단어 길이 재기
package StepByStep.Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str.length());

        br.close();
    }
}