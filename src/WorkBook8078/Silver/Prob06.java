package WorkBook8078.Silver;

import java.util.*;
import java.io.*;

public class Prob06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("end")) {
                break;
            }

            if (!(s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u"))) {
                sb.append("<").append(s).append("> is not acceptable.\n");
                continue;
            }

            int ja = 0; // 자음
            int mo = 0; // 모음
            char before = '0';
            boolean isAcceptable = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    mo++;
                    ja = 0;
                } else {
                    ja++;
                    mo = 0;
                }

                if (ja == 3 || mo == 3) {
                    sb.append("<").append(s).append("> is not acceptable.\n");
                    isAcceptable = false;
                    break;
                }

                if (c == before && c != 'e' && c != 'o') {
                    sb.append("<").append(s).append("> is not acceptable.\n");
                    isAcceptable = false;
                    break;
                }

                before = c;
            }

            if (isAcceptable) {
                sb.append("<").append(s).append("> is acceptable.\n");
            }
        }
        System.out.println(sb);

        br.close();
    }
}