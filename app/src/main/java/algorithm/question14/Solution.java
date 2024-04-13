package algorithm.question14;

public class Solution {
    public String solution(String newId){
        String changedNewId = newId;

        // 1단계: 대문자를 소문자로 치환
        changedNewId = changedNewId.toLowerCase();

        // 2단계: 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
        changedNewId = changedNewId.replaceAll("[^a-z0-9\\-_.]", "");

        // 3단계: 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
        changedNewId = changedNewId.replaceAll("\\.{2,}", ".");

        // 4단계: 마침표가 처음이나 끝에 위치할 경우 제거
        changedNewId = changedNewId.replaceAll("^\\.|\\.$", "");

        // 5단계: 빈 문자열인 경우 a 대입
        if(changedNewId.equals("")) changedNewId = "a";

        // 6단계: 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들 제거
        if(changedNewId.length() > 15) {
            changedNewId = changedNewId.substring(0, 15);
            changedNewId = changedNewId.replaceAll("\\.$", "");
        }

        // 7단계: 길이가 2자 이하인 경우, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝이 붙이기
        if(changedNewId.length() < 3){
            StringBuilder builder = new StringBuilder(changedNewId);
            for(int i=0; i<3-changedNewId.length(); i++){
                builder.append(changedNewId.charAt(changedNewId.length()-1));
            }
            changedNewId = builder.toString();
        }

        return changedNewId;
    }
}
