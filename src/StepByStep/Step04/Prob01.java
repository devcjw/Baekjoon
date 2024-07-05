// 10807번 개수 세기
package StepByStep.Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            if (v == arr[j])
                count++;
        }
        System.out.println(count);

        br.close();
    }
}
/*
< 배열 선언 및 초기화 방법 >
1. 배열 선언
1) 타입[] 배열명;
2) 타입 배열명[];

2. 배열 초기화
1) 타입[] 배열명 = new 타입[크기]; // 크기 지정
2) 타입[] 배열명 = {값1, 값2, 값3}; // 값으로 초기화
3) 타입[] 배열명 = new 타입[]{값1, 값2, 값3}; // new 키워드 사용
ex1) int[] intArray = new int[5]; // 길이가 5인 int 배열, 기본값 0으로 초기화
ex2) String[] stringArray = new String[5]; // 길이가 5인 String 배열, 기본값 null로 초기화

3. 다차원 배열 선언
1) 타입[][] 배열명;

4. 다차원 배열 초기화
1) 타입[][] 배열명 = new 타입[행][열]; // 크기 지정
2) 타입[][] 배열명 = {{값1, 값2}, {값3, 값4}}; // 값으로 초기화
3) 타입[][] 배열명 = new 타입[][]{{값1, 값2}, {값3, 값4}}; // new 키워드 사용
*/

