// 2587번 대표값2
package StepByStep.Step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int avg = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        Arrays.sort(arr);

        avg = sum / arr.length;

        System.out.println(avg);
        System.out.println(arr[2]);

        br.close();
    }
}