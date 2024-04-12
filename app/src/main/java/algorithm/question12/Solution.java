package algorithm.question12;

public class Solution {
    private static final String[] words = {"zero", "one", "two", "three", 
                                            "four", "five", "six", "seven", 
                                            "eight", "nine", "ten"};

    public int solution(String s){
        String changedStr = s;
        for(int i=0; i<10; i++){
            changedStr = changedStr.replace(words[i], Integer.toString(i));
        }

        return Integer.valueOf(changedStr);
    }
}
