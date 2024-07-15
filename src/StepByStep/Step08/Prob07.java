// 2869번 달팽이는 올라가고 싶다
package StepByStep.Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int days = (V - A) / (A - B); // 달팽이가 정상에 오르기 전날까지의 날
        if ((V - A) % (A - B) != 0) // 달팽이가 하루에 오르는 높이보다 정상까지의 높이가 짧을때
            days++;
        System.out.println(days + 1); // 마지막날 오른 기록은 계산식에 포함되어있지 않으므로 출력에 1일을 더해준다.

        br.close();
    }
}