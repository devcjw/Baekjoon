// 17266번 어두운 굴다리
package WorkBook8078.Silver;

import java.util.*;
import java.io.*;

public class Prob12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] lamps = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            lamps[i] = Integer.parseInt(st.nextToken());
        }

        int result = Math.max(lamps[0], n - lamps[m - 1]);

        for (int i = 0; i < m - 1; i++) {
            int value = lamps[i + 1] - lamps[i];

            if (value % 2 == 0) {
                result = Math.max(value / 2, result);
            } else {
                result = Math.max(value / 2 + 1, result);
            }
        }
        System.out.println(result);

        br.close();
    }
}