// 7568번 덩치
package WorkBook8078.Silver;

import java.util.*;
import java.io.*;

public class Prob05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int weight[] = new int[n];
        int height[] = new int[n];
        int rank[] = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (weight[i] < weight[j] && height[i] < height[j]) {
                    count++;
                }
                rank[i] = count;
            }
        }

        for (int k : rank) {
            sb.append(k).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}