package br.com.dio.exercicios.loops;

/* Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido. */

import java.util.Scanner;

public class EX2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float nota;

        System.out.println("Informe a nota do aluno: ");
        nota = scan.nextFloat();
        while(nota > 10.0 || nota < 0){
            System.out.println("Nota Inválida. Informe a nota do aluno: ");
            nota = scan.nextFloat();
        }

    }
}
