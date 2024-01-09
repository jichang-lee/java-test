package baekjun;

public class Multiple {

    public static void main(String[] args) {
        // (1) 3의 배수를 구하고 7의 배수를 제외 -> limit 0~200
        // (2) 각 배수의 대한 합

        int total = 0;

        //(1)
        for(int i = 0; i<=200; i++){
            if(i%3 == 0 && i%7 != 0){
                total += i;
                System.out.println("(1) : " + i);
            }
        }
        //(2)
        System.out.println("(2) : " + total);


    }



}
