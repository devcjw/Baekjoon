// 1157번 단어 공부
package WorkBook8078.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 영문자의 개수는 26개임

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                arr[str.charAt(i) - 97]++;
            else
                arr[str.charAt(i) - 65]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max)
                ch = '?';
        }
        System.out.print(ch);

        br.close();
    }
}