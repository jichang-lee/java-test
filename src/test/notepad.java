package test;

import java.util.Scanner;

public class notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String str = "";

        int numLong = a/4;
        for(int i = 0 ; i <numLong ; i++){
            str += "long ";
        }
            System.out.println(str + "int");


    }




}