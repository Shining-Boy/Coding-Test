package algorithm.question20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question20\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        String expression = br.readLine();
        br.close();

        Solution sol = new Solution();
        System.out.println(sol.solution(expression));
    }
}
