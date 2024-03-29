package algorithm.question5;

public class Solution {
    public int[] solution(long n){
        String strNum = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder(strNum);
        String reversedStr = stringBuilder.reverse().toString();

        char[] arr = reversedStr.toCharArray();

        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i] = arr[i] - '0';
        }

        return result;
    }
}
