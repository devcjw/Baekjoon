// 1018번 체스판 다시 칠하기
package StepByStep.Step12;

import java.util.*;
import java.io.IOException;
import java.io.*;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // N 입력 받기
        int M = Integer.parseInt(st.nextToken()); // M 입력 받기
        char[][] board = new char[N][M]; // 입력 받은 체스판을 저장할 2차원 배열 선언

        // 체스판 저장하기
        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        char[][] chessboard1 = {
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        };

        char[][] chessboard2 = {
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        };
        int temp = 32;
        int count = 32; // 8*8 board에서 B와 W의 개수가 얼마나 차이나는지를 담는 변수 선언
        // 반복해서 비교하며 최솟값을 구해야 하므로 최댓값이 되는 32로 초기화

        for (int i = 0; i + 7 < N; i++) {
            for (int j = 0; j + 7 < M; j++) {
                int count1 = 0;
                int count2 = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (board[i + k][j + l] != chessboard1[k][l]) count1++;
                        if (board[i + k][j + l] != chessboard2[k][l]) count2++;
                    }
                }
                temp = Math.min(count1, count2);
                count = Math.min(count, temp);
            }
        }
        System.out.println(count);

        br.close();
    }
}