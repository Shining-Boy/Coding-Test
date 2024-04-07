package algorithm.question8;

public class Solution {
    private String compact(String s, int token){
        StringBuffer builder = new StringBuffer();

        int currentIdx = 0;
        while(currentIdx<s.length()-token){
            int numOfSame = 1; 
            String subStr = s.substring(currentIdx, currentIdx+token);
            int compareStartIdx = currentIdx+token;
            for(int i=compareStartIdx; i<s.length()-token+1; i+=token){
                if(subStr.equals(s.substring(i, i+token))){
                    numOfSame++;
                    currentIdx += token;
                }else{
                    break;
                }
            }
            if(numOfSame==1){
                // builder.append(s.charAt(currentIdx));
                // currentIdx++;
                currentIdx += token;
                builder.append(subStr);
            }else{
                currentIdx += token;
                builder.append( String.valueOf(numOfSame) +  subStr);
            }
        }
        builder.append(s.substring(currentIdx));

        return builder.toString();
    }

    public int solution(String s){

        int maxTokenLen = (int)(s.length() / 2);
        int minStrLen = s.length();

        for(int i=1; i<=maxTokenLen; i++){
            int tokenLen = i;

            String compressedStr = compact(s, tokenLen);
            System.out.printf("token length: %d, compressed string: %s\n", tokenLen, compressedStr);
            if(minStrLen > compressedStr.length()){
                minStrLen = compressedStr.length();
            }
        }

        return minStrLen;
    }
}
