// 1330번 두 수 비교하기
package StepByStep.Step02;

import java.io.*;
import java.util.StringTokenizer;

public class Prob01 {
    public static void main(String[] args) throws IOException { // 입출력 작업 중 발생할 수 있는 예외를 호출자에게 전달한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 한줄의 입력을 받는다 (10, 2)
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 문자열 분리한다

        int A = Integer.parseInt(st.nextToken()); // 첫 번째 토큰 10을 가져와 A에 할당한다
        int B = Integer.parseInt(st.nextToken()); // 두 번째 토큰 2를 가져와 B에 할당한다

        br.close();

        StringBuilder sb = new StringBuilder(); // 불필요한 String 객체 생성 없이 문자열 조합할 수 있다.
                                                // 내부 버퍼에서 문자열을 직접 변경하므로, 메모리와 성능 측면에서 더 효율적이다.
        sb.append((A > B) ? ">" : ((A < B) ? "<" : "=="));

        System.out.println(sb); // System.out.println(sb.toString());과 동일

    }
}

/*
import java.util.Scanner;

public class Prob01 {
    public static void main(String[] args) { //Scanner는 주로 Unchecked Exception을 사용하며, 입출력 작업에서 throws IOException 선언이 필요 없다.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println('>');
        else if (a < b)
            System.out.println('<');
        else
            System.out.println("==");

        sc.close();
    }
}
*/