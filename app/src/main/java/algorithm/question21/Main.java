package algorithm.question21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question21\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        String numbers =  br.readLine();
        br.close();

        SolutionV3 sol = new SolutionV3();
        System.out.println(sol.solution(numbers));
    }
}
