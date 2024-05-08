package algorithm.question19;

public class Solution {
    public int[] solution(int brown, int yellow){

        for(int width=3; width<=2499; width++){
            for(int height=3; height<=width; height++){
                if((width+height-2)*2==brown && width*height-brown==yellow){
                    return new int[]{width, height};
                }
            }
        }

        return null;
    }
}
