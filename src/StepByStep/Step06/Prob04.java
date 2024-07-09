// 10988번 팰린드롬인지 확인하기
package StepByStep.Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        StringBuilder sb = new StringBuilder(str1); // StringBuffer: 멀티스레딩 환경에서 안전하며, 문자열의 변경이 빈번한 경우에 사용합니다.
                                                    // StringBuilder: 멀티스레딩 환경에서 안전하지 않지만, 단일 스레드 환경에서 StringBuffer보다 성능이 더 좋습니다.
        String str2 = sb.reverse().toString(); // sb.reverse()는 StringBuilder 객체 자체를 반환한다.
                                               // 따라서, toString() 메소드를 호출하여 String으로 변환해야 한다.
        if(str1.equals(str2))
            System.out.println(1);
        else
            System.out.println(0);

        br.close();
    }
}