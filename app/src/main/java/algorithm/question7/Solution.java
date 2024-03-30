package algorithm.question7;

public class Solution {
    public String solution(String s){
        StringBuffer stringBuffer = new StringBuffer();
        int wordIndex = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char changedC = c;
            if(c == ' '){
                wordIndex = 0;
            }else{
                if(wordIndex%2 == 0){
                    changedC = Character.toUpperCase(c);
                }else{
                    changedC = Character.toLowerCase(c);
                }
                wordIndex++;
            }
            stringBuffer.append(changedC);
        }

        String result = stringBuffer.toString();

        return result;
    }
}
