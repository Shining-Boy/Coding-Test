package algorithm.question14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        String inputPath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question14\\";
        BufferedReader br = new BufferedReader(new FileReader(inputPath + "input.txt"));

        int numOfInput = Integer.parseInt(br.readLine());

        Solution sol = new Solution();
        for(int i=0; i<numOfInput; i++){
            String s = br.readLine();
            System.out.println(sol.solution(s));
        }
    }
}
