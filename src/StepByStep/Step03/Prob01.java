// 2739번 구구단
package StepByStep.Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        br.close();

        for (int i = 1; i < 10; i++) {
            sb.append(N).append(" * ").append(i).append(" = ").append(N * i).append("\n");
        }

        System.out.println(sb);

//        for (int i = 1; i < 10; i++) {
//            sum = N * i;
//            System.out.printf("%d * %d = %d\n", N, i, N * i);
//        }
    }
}

/*
1. String: 불변, 쓰레드 안전하지 않음, 느림, 불변 문자열, 문자열 연산이 적고 변하지 않는 문자열을 자주 사용할 경우 사용
2. StringBuffer: 가변, 쓰레드 안전(동기화 제공), 동기화로 인해 상대적으로 느림, 멀티쓰레드에서 빈번한 문자열 변경, 문자열의 추가, 수정, 삭제 등이 빈번히 발생하는 경우 사용
3. StringBuilder: 가변, 쓰레드 안전하지 않음, 동기화가 없어 가장 빠름, 단일 쓰레드에서 빈번한 문자열 변경, 문자열의 추가, 수정, 삭제 등이 빈번히 발생하는 경우 사용
출처: https://inpa.tistory.com/entry/JAVA-☕-String-StringBuffer-StringBuilder-차이점-성능-비교 [Inpa Dev 👨‍💻:티스토리]
 */