package algorithm.question4;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2){
        int[][] result = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                int newArrValue = 0;
                for(int m=0; m<arr1[i].length; m++){
                    newArrValue = newArrValue + arr1[i][m]*arr2[m][j];
                }
                result[i][j] = newArrValue;
            }
        }

        return result;
    }
}
