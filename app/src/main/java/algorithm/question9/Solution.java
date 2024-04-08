package algorithm.question9;

public class Solution {
    public int solution(int n){
        String threeRadix = Integer.toString(n, 3);
        StringBuilder builder = new StringBuilder(threeRadix);
        String reversedStr = builder.reverse().toString();

        return Integer.parseInt(reversedStr, 3);
    }
}
