// 11720번 숫자의 합
package StepByStep.Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += input.charAt(i) - '0';
        // CharAt 함수는 문자열에서 index를 통해 특정 위치의 문자를 반환받는 함수이다.
        // - '0'을 통해 char형의 문자들을 int형으로 변환시킬 수 있다.

        System.out.println(sum);
    }
}