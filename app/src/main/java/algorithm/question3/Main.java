package algorithm.question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question3\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        int numberOfRoom = Integer.parseInt(br.readLine());
        String[][] inputData = new String[numberOfRoom][5];
        for(int i=0; i<numberOfRoom; i++){
            for(int j=0; j<5; j++){
                String line = br.readLine();
                if (line==null) break;

                inputData[i][j] = line;
            }
        }
        br.close();

        Solution solutionInstance = new Solution();
        for(int i : solutionInstance.solution(inputData)){
            System.out.printf("%d ", i);
        }
    }
}
