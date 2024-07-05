// 11382번 꼬마정민
package StepByStep.Step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // A,B,C는  1이상 10^12 이하 정수이므로 long타입 써줘야 함
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(A + B + C);

        br.close();
    }
}

/*
Integer.parseInt();는 String 타입으로 되어 있는 숫자를 기본형 타입의 숫자로 변환해주는 역할을 한다.
String 타입의 문자열이 무조건 숫자로만 이루어져 있어야 하고 a123과 같이 문자가 섞여있다면 변환이 불가능하고 에러를 발생시킨다.

<종류>
1. Byte.parseByte();
2. Short.parseShort();
3. Integer.parseInt();
4. Long.parseLong();
5. Float.parseFloat();
6. Double.parseDouble();
*/
