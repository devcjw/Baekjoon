// 1085번 직사각형에서 탈출
package StepByStep.Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_min = Math.min(x, w - x); // x축 최소거리
        int y_min = Math.min(y, h - y); // y축 최소거리

        // x와 y축 최소거리 중 가장 작은 값
        System.out.println(Math.min(x_min, y_min));

        br.close();
    }
}