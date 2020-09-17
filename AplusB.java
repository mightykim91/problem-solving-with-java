//Baeckjoon Online Judge #15552 https://www.acmicpc.net/problem/15552

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;


public class AplusB{

    public static void main(String args[]) throws IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); Use it for manual input
        BufferedReader br = new BufferedReader(new FileReader("AplusB.txt"));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
        for (int i=0; i < n; i++){
            String[] numbers = br.readLine().split(" ");
            int sum = 0;
            for (int j=0; j < numbers.length; j++){
                sum += Integer.parseInt(numbers[j]);
            }
            System.out.println(sum);
        }
    }
}