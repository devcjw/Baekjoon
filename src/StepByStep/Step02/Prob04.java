// 14681번 사분면 고르기
package StepByStep.Step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        br.close();

        if (X > 0 && Y > 0)
            System.out.println(1);
        else if (X < 0 && Y > 0)
            System.out.println(2);
        else if (X < 0 && Y < 0)
            System.out.println(3);
        else
            System.out.println(4);
    }
}
