package LV1;

import java.util.HashMap;

public class TEST1 {

    //프로그래머스
// https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java


    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {

            int[] answer = new int[photo.length];

            for(int i = 0; i < photo.length; i++){
                //담아둘거
                HashMap<String,Integer> yearningMap = new HashMap<>();

                //사진별 그리움 점수
                for(int j = 0; j <name.length; j++){
                    yearningMap.put(name[j],yearning[j]);
                }
                int totalYearning = 0;
            }

            return answer;
        }
    }
}
