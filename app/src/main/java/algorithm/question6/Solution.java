package algorithm.question6;

public class Solution {
    private char push(char c, int n) {
        char result = ' ';

        if(c >= 'a' && c <= 'z'){
            result = (char)((c + n - 'a') % ('z' - 'a' + 1) + 'a');
        }else if(c >= 'A' && c <= 'Z'){
            result = (char)((c + n - 'A') % ('Z' - 'A' + 1) + 'A');
        }
        

        return result;
    }

    public String solution(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray()){
            stringBuilder.append(push(c, n));
        }

        String result = stringBuilder.toString();

        return result;
    }
}
