package test;

import java.util.Scanner;

public class notepad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n ; i++){

            int A =scanner.nextInt();
            int B =scanner.nextInt();
            System.out.println(A+B);

        }
    }

}



//    첫째 줄에 테스트 케이스의 개수 T가 주어진다.

//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)