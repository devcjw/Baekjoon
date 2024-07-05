// 10871번 X보다 작은 수
package StepByStep.Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (X > arr[i]) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);

        br.close();
    }
}
/*
< 오류와 예외의 차이점 >
1. 시스템 오류(error)
- 가상 머신에서 발생, 프로그래머가 처리 할 수 없는 오류임
- 동적 메모리가 없는 경우, 스택 메모리 오버플로우등

2. 예외(Exception)
- 프로그램에서 제어 할 수 있는 오류이다.
- 읽어들이려는 파일이 존재하지 않거나, 네트웍이나 DB연결이 안되는 경우, Null Pointer 등

정리. 자바는 안전성이 중요한 언어로 대부분 프로그램에서 발생하는 오류에 대해 문법적으로 예외 처리를 해야한다!
*/