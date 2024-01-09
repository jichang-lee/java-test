package baekjun;

import java.util.Scanner;

    //https://www.acmicpc.net/problem/2480
public class dice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dice = new int[3];
        for(int i = 0; i < dice.length; i++){
           dice[i] =  scanner.nextInt();
        }

        int prize = calculatePrize(dice);
        System.out.println(prize);
        scanner.close();
    }

    private static int calculatePrize(int[] dice){
        int prize = 0;

        if(dice[0] == dice[1] && dice[1] == dice[2]){
            prize = 10000 + dice[0] * 1000;
        }else if(dice[0] == dice[1] || dice[0] == dice[2] || dice[1]==dice[2]) {
            prize = 1000 + (dice[0] == dice[1] ? dice[0] : dice[2]) * 100;
//        }else if(dice[0] != dice[1] && dice[1] != dice[2]){
//            prize = Math.max(dice[0],Math.max(dice[1],dice[2])) * 100;
//        } 그냥 else로 풀이
        }else {
            prize = Math.max(dice[0],Math.max(dice[1],dice[2])) * 100;
        }
        return prize;
    }

}