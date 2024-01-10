package test;

import java.util.Scanner;

public class notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0 ;

        int totalPrice = scanner.nextInt();
        int product = scanner.nextInt();

        for(int i = 0 ; i<product ; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + " " + b);
            result += a * b;
        }

        if(totalPrice == result){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }

    }




}