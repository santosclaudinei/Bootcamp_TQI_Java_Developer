package br.com.dio.desafios;

import java.util.Scanner;

public class Batmain {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        int count = 0;
        while(count < t) {
            String vilao = scan.next();
            System.out.println("Y");
            count++;
        }
    }

}
