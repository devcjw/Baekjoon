// 20125번 쿠키의 신체 측정
package WorkBook8078.Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob08 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] matrix = new String[N];
        int heartX = -1, heartY = -1;
        int waistLen = 0, leftLegLen = 0, rightLegLen = 0;

        for (int i = 0; i < N; i++) {
            matrix[i] = br.readLine();
            int firstStarIdx = matrix[i].indexOf('*');
            if (firstStarIdx == -1) continue;
            if (heartX == -1 && heartY == -1) {
                heartX = firstStarIdx + 1;
                heartY = i + 2;
                sb.append(heartY).append(" ").append(heartX).append("\n");
                continue;
            }

            int lastStarIdx = matrix[i].lastIndexOf('*');
            if (heartY - 1 == i) {
                // 팔
                sb.append(heartX - (firstStarIdx + 1)).append(" "); // 왼팔
                sb.append((lastStarIdx + 1) - heartX).append(" "); // 오른팔
                continue;
            }

            if (heartY - 1 < i) {
                // 허리, 다리
                if (firstStarIdx + 1 == heartX) {
                    waistLen++;
                    continue;
                }

                if (firstStarIdx + 2 == heartX) {
                    // 왼쪽 다리
                    leftLegLen++;
                }

                if (lastStarIdx == heartX) {
                    // 오른쪽 다리
                    rightLegLen++;
                }
            }
        }

        sb.append(waistLen).append(" ").append(leftLegLen).append(" ").append(rightLegLen);
        System.out.println(sb);
    }
}