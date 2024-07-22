// 23971번 ZOAC 4
package WorkBook8078.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int width = 0;
        int height = 0;

        // n = 1이라면, 사람이 한 자리에 앉고 한 칸 띄우기 때문에 +1은 내가 앉는 자리를 뜻한다.
        for (int i = 0; i < H; i += (N + 1)) {
            width++;
        }

        // +1은 내가 앉은 자리를 뜻한다. m은 멀어지는 칸의 수이다.
        for (int i = 0; i < W; i += (M + 1)) {
            height++;
        }

        System.out.println(width * height);

        br.close();
    }
}