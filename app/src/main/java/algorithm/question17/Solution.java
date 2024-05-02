package algorithm.question17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final char[] CHARS = new char[]{'A', 'E', 'I', 'O', 'U'};

    private List<String> generate(String word) {
        List<String> words = new ArrayList<>();
        words.add(word);

        if(word.length()==5)
            return words;

        for(char c : CHARS){
            words.addAll(generate(word + c));
        }

        return words;
    }

    public int solution(String s){
        return generate("").indexOf(s);
    }
}
