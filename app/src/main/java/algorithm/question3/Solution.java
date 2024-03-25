package algorithm.question3;

import java.util.Arrays;

public class Solution {
    private static final int dx[] = {0, -1, 1, 0};
    private static final int dy[] = {1, 0, 0, -1};

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude){
        for(int i=0; i<4; i++){
            if(i==exclude) continue;

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(ny==room.length || nx==room.length || ny==-1 || nx==-1 || room[ny][nx]=='X') continue;

            if(room[ny][nx] == 'P') return false;
        }

        return true;
    }

    private boolean isDistanced(char[][] room, int x, int y){
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(ny==room.length || nx==room.length || ny==-1 || nx==-1 || room[ny][nx]=='X') continue;

            if(room[ny][nx] == 'P') return false;

            if(isNextToVolunteer(room, nx, ny, 3-i)==false) return false;
        }

        return true;
    }

    private boolean isDistanced(char[][] room){
        for(int i=0; i<room.length; i++){
            for(int j=0; j<room[i].length; j++){
                if(room[i][j] == 'P' && isDistanced(room, j, i)==false){
                    return false;
                }
            }
        }

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
                result[resultIdx] = 1;
            }
            resultIdx++;
        }

        return result;
    }
}
