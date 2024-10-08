// 2753번 윤년
package StepByStep.Step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        br.close();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println('1');
        else
            System.out.println('0');
    }
}
