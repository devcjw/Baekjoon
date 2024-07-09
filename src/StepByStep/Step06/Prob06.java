// 2941번 크로아티아 알파벳
package StepByStep.Step06;

import java.io.*;

public class Prob06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] croatianAlphabets = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String alphabet : croatianAlphabets)
            input = input.replace(alphabet, "1");

        System.out.println(input.length());

        br.close();
    }
}