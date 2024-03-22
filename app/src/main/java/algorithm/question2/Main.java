package algorithm.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//삼각 달팽이 문제
public class Main {

    public static void main(String[] args) throws IOException {
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question2\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(n);

        Solution solutionInstance = new Solution();
        int[] result = solutionInstance.solution(n);

        for(int v : result){
            System.out.print(String.valueOf(v) + " ");
        }
    }
}
