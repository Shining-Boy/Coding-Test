package algorithm.question13;

public class Solution {
    public boolean solution(String s){
        boolean matches = s.matches("[0-9]{4}|[0-9]{6}");

        return matches;
    }
}
