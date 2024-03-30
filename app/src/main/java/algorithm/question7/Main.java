package algorithm.question7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        String inputPath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question7\\";
        BufferedReader br = new BufferedReader(new FileReader(inputPath + "input.txt"));

        String inputStr = br.readLine();

        Solution sol = new Solution();
        System.out.println(sol.solution(inputStr));
    }
}
