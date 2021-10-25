package br.com.dio.exercicios.loops;

/* Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares
e a quantidade de números impares.*/

import java.util.Scanner;

public class EX4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, n, cont, cont_par, cont_impar;
        cont = 0;
        cont_par = 0;
        cont_impar = 0;

        System.out.println("Informe a quantidade de números a serem inseridos: ");
        n = scan.nextInt();

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();
            cont ++;
            if(numero % 2 == 0){
                cont_par++;
            }else cont_impar ++;
        }while (cont <= (n-1));

        System.out.println("A quantidade de números digitados foi: " + n);
        System.out.println("A quantidade de números pares digitados foi: " + cont_par);
        System.out.println("A quantidade de números impares digitados foi: " + cont_impar);
    }
}
