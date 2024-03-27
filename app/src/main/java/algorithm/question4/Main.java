package algorithm.question4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question4\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        int arrRowLen1 = Integer.parseInt(br.readLine());
        int arrColLen1 = Integer.parseInt(br.readLine());
        int arrRowLen2 = Integer.parseInt(br.readLine());
        int arrColLen2 = Integer.parseInt(br.readLine());

        int arr1[][] = new int[arrRowLen1][arrColLen1];
        int arr2[][] = new int[arrRowLen2][arrColLen2];

        for(int i=0; i<arrRowLen1; i++){
            String[] lineData = br.readLine().split(" ");
            for(int j=0; j<arrColLen1; j++){
                arr1[i][j] = Integer.parseInt(lineData[j]);
            }
        }
        for(int i=0; i<arrRowLen2; i++){
            String[] lineData = br.readLine().split(" ");
            for(int j=0; j<arrColLen2; j++){
                arr2[i][j] = Integer.parseInt(lineData[j]);
            }
        }

        Solution sol = new Solution();
        int result[][] = sol.solution(arr1, arr2);

        for(int i=0; i<result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
