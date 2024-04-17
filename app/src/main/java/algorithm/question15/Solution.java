package algorithm.question15;

public class Solution {
    private int[][] arr;

    private int[] recursiveCompress(int offsetX, int offsetY, int size){
        if(size==1 && arr[offsetY][offsetX]==0) return new int[]{1, 0};
        
        if(size==1 && arr[offsetY][offsetX]==1) return new int[]{0, 1};

        int numOfZero = 0;
        int numOfOne = 0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[offsetY+i][offsetX+j]==0)
                    numOfZero++;
                else
                    numOfOne++;
            }
        }

        if(numOfZero == 0)
            return new int[]{0, 1};
        if(numOfOne == 0)
            return new int[]{1, 0};

        int[] part1 = recursiveCompress(offsetX, offsetY, size/2);
        int[] part2 = recursiveCompress(offsetX+size/2, offsetY, size/2);
        int[] part3 = recursiveCompress(offsetX, offsetY+size/2, size/2);
        int[] part4 = recursiveCompress(offsetX+size/2, offsetY+size/2, size/2);

        return new int[]{part1[0]+part2[0]+part3[0]+part4[0], part1[1]+part2[1]+part3[1]+part4[1]};
    }

    public int[] solution(int[][] arr){
        this.arr = arr;

        int[] result = recursiveCompress(0, 0, arr.length);


        return result;
    }
}
