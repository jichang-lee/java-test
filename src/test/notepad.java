package test;

import java.io.*;
import java.util.StringTokenizer;

public class notepad {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }

        br.close();

    }

}




