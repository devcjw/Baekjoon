// 8979번 올림픽
package WorkBook8078.Silver;

import java.io.*;
import java.util.*;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] medal = new int[N][4];
        int[] kMedal = new int[3];
        int count = 1;

        for (int i = 0; i < medal.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            medal[i][0] = Integer.parseInt(st.nextToken());
            medal[i][1] = Integer.parseInt(st.nextToken());
            medal[i][2] = Integer.parseInt(st.nextToken());
            medal[i][3] = Integer.parseInt(st.nextToken());

            if (medal[i][0] == K) {
                kMedal[0] = medal[i][1];
                kMedal[1] = medal[i][2];
                kMedal[2] = medal[i][3];
            }
        }

        for (int i = 0; i < medal.length; i++) {
            if (medal[i][1] > kMedal[0]) {
                count++;
            } else if (medal[i][1] == kMedal[0]) {
                if (medal[i][2] > kMedal[1]) {
                    count++;
                } else if (medal[i][2] == kMedal[1]) {
                    if (medal[i][3] > kMedal[2]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

        br.close();
    }
}
