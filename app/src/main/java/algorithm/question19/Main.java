package algorithm.question19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question19\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        int brown = Integer.parseInt(br.readLine());
        int yellow = Integer.parseInt(br.readLine());
        br.close();

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(brown, yellow)));
    }
}
