package algorithm.question18;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int[][] RULES = {
        {1, 2, 3, 4, 5},
        {2, 1, 2, 3, 2, 4, 2, 5},
        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    private int getPicked(int person, int problem){
        int[] rule = RULES[person];
        int index = problem % rule.length;

        return rule[index];
    }

    public int[] solution(int[] answers) {
        int[] corrects = new int[]{0, 0, 0};

        int maxCorrect = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<answers.length; j++){
                if(answers[j] == getPicked(i, j)){
                    corrects[i]++;
                }
            }
            maxCorrect = maxCorrect < corrects[i] ? corrects[i] : maxCorrect;
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0; i<3; i++){
            if(corrects[i] == maxCorrect){
                result.add(i+1);
            }
        }

        int[] result2 = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            result2[i] = result.get(i);
        }

        return result2;
    }
}
