// 10926번 ??!
package StepByStep.Step01;

// 입력 데이터가 많을 경우에는 BufferedReader 사용하여 소요시간 및 메모리 절약
import java.io.*;

public class Prob07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(input + "??!");

        br.close();
    }
}