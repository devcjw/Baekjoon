// 25757번 임스와 함께하는 미니게임
package WorkBook8078.Silver;

import java.io.*;
import java.util.*;

public class Prob07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String mode = st.nextToken();

        HashSet<String> nameList = new HashSet<>();
        for (int i = 0; i < N; i++)
            nameList.add(br.readLine());

        switch (mode) {
            case "Y":
                // 임스 본인을 제외한 2 - 1 = 1
                System.out.println(nameList.size() / 1);
                break;
            case "F":
                // 임스 본인을 제외한 3 - 1 = 2
                System.out.println(nameList.size() / 2);
                break;
            case "O":
                // 임스 본인을 제외한 4 - 1 = 3
                System.out.println(nameList.size() / 3);
                break;
        }

        br.close();
    }
}