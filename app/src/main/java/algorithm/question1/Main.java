package algorithm.question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 주어진 직선좌표의 교점을 찾아 별 만들기
public class Main {
    public static void main(String[] args) throws IOException {
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question1\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        int numberOfLine = Integer.parseInt(br.readLine());
        int inputData[][] = new int [numberOfLine][]; 
        for(int i=0; i<numberOfLine; i++) {
            String line = br.readLine();
            if (line==null) break;  

            String[] values = line.split(" ");
            int[] lineData = new int[values.length];
            for(int j=0; j<values.length; j++){
                lineData[j] = Integer.parseInt(values[j]);
            }
            inputData[i] = lineData;
        }
        br.close();

        Solution solutionInstance = new Solution();
        for(String eachLine : solutionInstance.solution(inputData)){
            System.out.println(eachLine);
        }
    }
}
