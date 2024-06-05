package algorithm.question22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputpath = System.getProperty("user.dir") + "\\app\\src\\main\\java\\algorithm\\question22\\";
        BufferedReader br = new BufferedReader(new FileReader(inputpath + "input.txt"));

        int numberOfId = Integer.parseInt(br.readLine());
        // List<String> idList = new ArrayList<>();
        String[] idList = new String[numberOfId];
        for(int i=0; i<numberOfId; i++) {
            String line = br.readLine();
            idList[i] = line;
        }
        int numberOfbanned = Integer.parseInt(br.readLine());
        // List<String> bannedList = new ArrayList<>();
        String[] bannedList = new String[numberOfbanned];
        for(int i=0; i<numberOfbanned; i++) {
            String line = br.readLine();
            bannedList[i] = line;
        }
        br.close();

        Solution sol = new Solution();
        System.out.println(sol.solution(idList, bannedList));
    }
}
