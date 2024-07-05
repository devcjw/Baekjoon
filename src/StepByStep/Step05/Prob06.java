// 10809번 알파벳 찾기
package StepByStep.Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Prob06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String S = br.readLine();

        // 단어를 순회하면서 각 단어의 인덱스값 배열의 인덱스에 넣기
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            // arr 원소 값이 -1 인 경우 초기화
            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
//      for(int val : arr) {	// 배열 출력
//          System.out.print(val + " ");
        for (int i = 0; i < 26; i++)
            sb.append(arr[i]).append(" ");

        System.out.println(sb);

        br.close();
    }
}