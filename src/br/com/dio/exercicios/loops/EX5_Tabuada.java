package br.com.dio.exercicios.loops;

/* Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10.
O usuário deve informar de qual numero
ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50 */

import java.util.Scanner;

public class EX5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, i;

        System.out.println("Informe o número que deseja verificar a tabuada: ");
        numero = scan.nextInt();

        if (numero > 0 || numero < 10){
            System.out.println("Tabuada de " + numero + ":");
            for(i=1; i<11; i++){
                System.out.println(numero + " X " + i);
            }
        }else System.out.println("Número inválido.");

    }
}
