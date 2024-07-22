// 11723번 집합
package WorkBook8078.Silver;

import java.util.*;
import java.io.*;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());

        boolean[] set = new boolean[21];
        StringTokenizer st;

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("add")) {
                int num = Integer.parseInt(st.nextToken());
                set[num] = true;
            } else if (command.equals("remove")) {
                int num = Integer.parseInt(st.nextToken());
                set[num] = false;
            } else if (command.equals("check")) {
                int num = Integer.parseInt(st.nextToken());
                if (set[num])
                    bw.write("1\n");
                else
                    bw.write("0\n");
            } else if (command.equals("toggle")) {
                int num = Integer.parseInt(st.nextToken());
                set[num] = !set[num];
            } else if (command.equals("all")) {
                for (int i = 1; i <= 20; i++)
                    set[i] = true;
            } else if (command.equals("empty")) {
                set = new boolean[21];
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}