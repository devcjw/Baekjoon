// 10101번 삼각형 외우기
package StepByStep.Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == 60 && b == 60 && c == 60)
            System.out.println("Equilateral");
        else if (a + b + c == 180 && a == b || b == c || c == a)
            System.out.println("Isosceles");
        else if (a + b + c == 180 && a != b && b != c && a != c)
            System.out.println("Scalene");
        else if (a + b + c != 180)
            System.out.println("Error");

        br.close();
    }
}