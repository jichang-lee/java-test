package LV1;

import java.util.Arrays;
import java.util.HashMap;

public class TEST1 {
//프로그래머스
// https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java


    class Solution {
        //static 임시
        public static int[] solution(String[] name, int[] yearning, String[][] photo) {

            //사람의 그리움 점수 담아둘 Map
            HashMap<String,Integer> yearningMap = new HashMap<>();
            for(int i = 0; i < name.length; i++){
                yearningMap.put(name[i],yearning[i]);
            }

            // 점수 저장할 배열
            int answer[] = new int[photo.length];

            for(int i = 0; i< photo.length; i++){
                int totalYearning = 0;
            //사진 인물에 대한 점수 합산
                for(int j = 0; j< photo[i].length;j++){
                    String person = photo[i][j];
                    if(yearningMap.containsKey(person)){
                        totalYearning += yearningMap.get(person);
                    }
                }
                answer[i] = totalYearning;
            }
            return answer;
        }

        class example {
            public static void main(String[] args) {

                String[] name = {"may", "kein", "kain", "radi"};
                int[] yearning = {5, 10, 1, 3};
                String[][] photo = {
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}
                };

                int[] result = Solution.solution(name, yearning, photo);
                System.out.println(Arrays.toString(result));
            }
        }

    }
}
