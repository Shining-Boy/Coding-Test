package algorithm.question11;

public class Solution {
    public Boolean solution(String s){
        String lowerStr = s.toLowerCase();

        int numberOfP = s.length() - lowerStr.replace("p", "").length();
        int numberOfS = s.length() - lowerStr.replace("y", "").length();

        return numberOfP==numberOfS ? true : false;
    }
}
