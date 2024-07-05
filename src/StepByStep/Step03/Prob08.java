// 11022번 A+B - 8
package StepByStep.Step03;

import java.util.*;
import java.io.*;

public class Prob08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}

/*
// 아래의 코드에서는 각 String.valueOf() 호출마다 새로운 문자열 객체가 생성될 수 있습니다.
// 반면, 위의 코드에서는 StringBuilder를 사용하여 문자열을 누적하면서 불필요한 객체 생성을 최소화했습니다.
import java.io.*;
import java.util.StringTokenizer;

public class Prob08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader로 문자 입력, InputStreamReader로 바이트 스트림을 문자 스트림으로 변환, System.in으로 키보드로부터 입력 받음
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //BufferedWriter로 문자 출력, OutputStreamWriter로 문자 스트림을 바이트 스트림으로 변환, System.out으로 결과를 화면에 출력
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.append("Case #");
            bw.append(String.valueOf(i)); //String.valueOf()는 문자열로 변환해주는 메서드
            bw.append(": ");
            bw.append(String.valueOf(A));
            bw.append(" + ");
            bw.append(String.valueOf(B));
            bw.append(" = ");
            bw.append(String.valueOf(A + B));
            bw.append("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
*/
