package WorkBook8078.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob11 {
    static int[] input, scores;
    static int[] teamCount, teamScoreSum, teamScoreSumWithFive, teamScoreSumCount;
    static int minScoreTeam, minScoreSum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        // 1.   input 배열을 모두 확인해서
        //      1부터 200번 까지의 팀원 수를 배열에 모두 카운트 (팀 자격 확인 용도)
        // 2.   자격이 되는 팀을 알았으니 이제 각 사람의 점수를 계산한다.
        // 3.   각 사람의 점수를 바탕으로 팀의 점수를 계산한다.
        //      이 때, 몇 명을 카운트했는지도 같이 저장해야 한다.

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); // N : 6 ~ 1000
            st = new StringTokenizer(br.readLine());

            input = new int[N]; // 들어온 순서
            scores = new int[N]; // 들어온 사람의 계산된 점수

            teamCount = new int[201]; // 팀 자격 확인 용
            teamScoreSum = new int[201]; // 합산용
            teamScoreSumWithFive = new int[201]; // 5명 합산용
            teamScoreSumCount = new int[201]; // 합산 카운트용

            // MAX 값으로 초기화
            for (int i = 0; i < 201; i++) {
                teamScoreSum[i] = Integer.MAX_VALUE;
            }

            // input 배열 받기, 팀원 수 count
            for (int i = 0; i < N; i++) {
                input[i] = Integer.parseInt(st.nextToken());
                teamCount[input[i]]++;
            }

            // 점수 계산
            int score = 1; // 1부터 계속 증가
            for (int i = 0; i < N; i++) {
                int curTeam = input[i];
                // 자격이 되는 팀만
                if (isValidTeam(curTeam)) {
                    scores[i] = score++;
                } // 자격이 안되는 팀은 점수가 0으로 남아 있음
            }

            // 팀 점수 계산해서 저장
            for (int i = 0; i < N; i++) {
                int curTeam = input[i];
                int curScore = scores[i];
                // 자격이 되는 팀이고, 합산된 사람의 수가 4명 이하일 때만
                if (isValidTeam(curTeam) && teamScoreSumCount[curTeam] < 4) {
                    teamScoreSumCount[curTeam]++; // 합산된 사람의 수 count
                    teamScoreSum[curTeam] += curScore; // 합산
                } else if (isValidTeam(curTeam) && teamScoreSumCount[curTeam] == 4) {
                    teamScoreSumCount[curTeam]++;
                    teamScoreSumWithFive[curTeam] += curScore; // 다섯번 째 선수를 고려하기 위한 또다른 배열
                }
            }

            // 합산이 제일 작은 팀 찾기
            minScoreTeam = 1; // 1번팀 부터
            minScoreSum = Integer.MAX_VALUE;

            for (int i = 1; i < 201; i++) {
                // 더 낮다 ?? -> 갱신
                if (teamScoreSum[i] < teamScoreSum[minScoreTeam]) {
                    minScoreTeam = i;
                    minScoreSum = teamScoreSum[i];
                } else if (teamScoreSum[i] == teamScoreSum[minScoreTeam]) {
                    // 같다 ?? -> 5번째도 확인
                    if (teamScoreSumWithFive[i] < teamScoreSumWithFive[minScoreTeam]) {
                        minScoreTeam = i;
                        minScoreSum = teamScoreSum[i];
                    }
                }
            }

            // 해당 케이스 정답
            sb.append(minScoreTeam).append("\n");
        }

        // 전체 정답 출력
        System.out.println(sb);

        br.close();
    }

    static boolean isValidTeam(int curTeam) {
        return teamCount[curTeam] >= 6;
    }
}