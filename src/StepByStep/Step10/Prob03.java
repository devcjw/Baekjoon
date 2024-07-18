// 3009번 네 번째 점
package StepByStep.Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        String[] s3 = br.readLine().split(" ");

        if (s1[0].equals(s2[0]))
            sb.append(s3[0]);
        else if (s1[0].equals(s3[0]))
            sb.append(s2[0]);
        else
            sb.append(s1[0]);

        sb.append(" ");

        if (s1[1].equals(s2[1]))
            sb.append(s3[1]);
        else if (s1[1].equals(s3[1]))
            sb.append(s2[1]);
        else
            sb.append(s1[1]);

        System.out.print(sb);

        br.close();
    }
}