package WorkBook8078.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prob09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        if (N == 0) {
            System.out.println(1);
            return;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (N == P && newScore <= arr[N - 1]) {
            System.out.println(-1);
            return;
        }

        int index = 1;

        for (int i = 0; i < N; i++) {
            if (newScore < arr[i]) {
                index++;
            } else {
                break;
            }
        }
        System.out.println(index);
    }

}