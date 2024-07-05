// 9498번 시험 성적
package StepByStep.Step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());
        char result;

        br.close();

        if (score >= 90)
            result = 'A';
        else if (score >= 80)
            result = 'B';
        else if (score >= 70)
            result = 'C';
        else if (score >= 60)
            result = 'D';
        else
            result = 'F';

        System.out.println(result);
    }
}

/*
import java.util.Scanner;

public class Prob02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade;
        int score = sc.nextInt();

        if (score >= 90 && score <= 100)
            grade = 'A';
        else if (score >= 80 && score < 90)
            grade = 'B';
        else if (score >= 70 && score < 80)
            grade = 'C';
        else if (score >= 60 && score < 70)
            grade = 'D';
        else
            grade = 'F';

        System.out.println(grade);
    }
}
*/