package algorithm.question20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    private static final String[][] preorders = {
        "+-*".split(""),
        "+*-".split(""),
        "*+-".split(""),
        "*-+".split(""),
        "-*+".split(""),
        "-+*".split("")
    };

    //StringTokenizer tokenizer = new StringTokenizer(ex)

    private long calculate(long lhs, long rhs, String op){
        long result = 0;

        //System.out.println(lhs + " " + op + " " + rhs);

        switch (op) {
            case "+":
                result = lhs + rhs;
                break;
            case "-":
                result = lhs - rhs;
                break;
            case "*":
                result = lhs * rhs;
        }

        return result;
    }

    private long calculate(List<String> tokens, String[] preorder){
        int idx = 0;
        long partResult = 0;
        List<String> newTokens = new ArrayList<>(tokens);
        for(int i=0; i<tokens.size(); i++){
            if(tokens.get(i).equals(preorder[0])){
                partResult = calculate(Long.parseLong(newTokens.get(idx-1)), Long.parseLong(newTokens.get(idx+1)), preorder[0]);
                newTokens.remove(idx-1);
                newTokens.remove(idx-1);
                //System.out.println(partResult);
                newTokens.set(idx-1, String.valueOf(partResult));
                idx = idx - 1;
                //System.out.println(newTokens);
                continue;
            }
            idx++;
        }

        if(preorder.length == 1){
            return partResult;
        }

        String[] newPreorder = Arrays.copyOfRange(preorder, 1, preorder.length);

        return calculate(newTokens, newPreorder);
    }

    public long solution(String expression){
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while(tokenizer.hasMoreTokens()){
            tokens.add(tokenizer.nextToken());
        }
        //System.out.println(tokens.toString());
        long max = 0;
        for(String[] s : preorders){
            long value = calculate(tokens, s);
            if(value < 0) value = -value;
            //System.out.println("result = " + value);
            if(value > max) max = value;
        }

        return max;
    }
}
