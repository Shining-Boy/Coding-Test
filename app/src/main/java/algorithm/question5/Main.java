package algorithm.question5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question5\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        long n = Long.parseLong(br.readLine());

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(n)));
    }
}
