package test;

import java.io.*;
import java.util.Scanner;


public class notepad {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);


        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            int sum = A + B;

            // 결과 출력
            System.out.println("Case #" + i + ": " + sum);
        }




    }

}




