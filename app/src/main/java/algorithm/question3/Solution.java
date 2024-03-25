package algorithm.question3;

import java.util.Arrays;

public class Solution {

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude){
        return true;
    }

    private boolean isDistanced(char[][] room, int x, int y){
        return true;
    }

    private boolean isDistanced(char[][] room){
        return true;
    }
    
    public int[] solution(String[][] places) {
        int[] result = new int[places.length];
        Arrays.fill(result, 0);

        int resultIdx = 0;
        for(String[] place : places){
            char[][] room = new char[place.length][];
            for(int i=0; i<place.length; i++){
                room[i] = place[i].toCharArray();
            }
            if(isDistanced(room)){
                result[resultIdx++] = 1;
            }
        }

        return result;
    }
}
