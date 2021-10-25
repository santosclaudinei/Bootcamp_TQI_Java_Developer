package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial
 de um número inteiro fornecido pelo usuário.
        Ex.: 5!=5.4.3.2.1=120 */

public class EX6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, i, fatorial, acm;
        fatorial = 1;

        System.out.println("Informe um número para saber o seu fatorial: ");
        numero = scan.nextInt();

        if ((numero >= 0) && (numero < 3)){
            fatorial = numero;
            System.out.println(fatorial);
        }else
            for (i=numero; i>1; i--){
                fatorial *= i;
            }
        System.out.println(numero + "! = " + fatorial);
    }
}
