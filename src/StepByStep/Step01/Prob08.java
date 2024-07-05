// 18108번 1998년생인 내가 태국에서는 2541년생?!
package StepByStep.Step01;

import java.io.*;

public class Prob08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        System.out.println(year - 543);

        br.close();
    }
}
