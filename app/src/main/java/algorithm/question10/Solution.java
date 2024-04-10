package algorithm.question10;

public class Solution {
    private int convert(StringBuilder builder){

        String s = builder.toString();
        builder.setLength(0);
        int numOfZero = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                numOfZero++;
            }
        }

        builder.append(Integer.toString(s.length() - numOfZero, 2));

        return numOfZero;
    }

    public int[] solution(String s){
        int[] result = new int[]{0, 0};

        StringBuilder builder = new StringBuilder(s);

        while(!builder.toString().equals("1")){
            int numOfZero = convert(builder);
            result[0]++;
            result[1] = result[1] + numOfZero;
        }
        
        return result;
    }
}
