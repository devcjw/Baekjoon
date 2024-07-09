// 3003번 킹,퀸,룩,비숍,나이트,폰
package StepByStep.Step06;

import java.io.*;
import java.util.StringTokenizer;

public class Prob02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(1-a).append(" ").append(1-b).append(" ").append(2-c).append(" ").append(2-d).append(" ").append(2-e).append(" ").append(8-f);

        System.out.println(sb);

        br.close();
    }
}