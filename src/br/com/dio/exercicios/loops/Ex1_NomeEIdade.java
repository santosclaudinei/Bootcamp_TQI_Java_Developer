package br.com.dio.exercicios.loops;

/*Faça um programa que leia conjuntos de dois valores,
o primeiro representando a matrícula do aluno
e o segundo representando a sua altura em centímetros.
(Pare inserindo o valor 0 no campo nome)*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Informe o nome do aluno: ");
            nome = scan.next();
            if (nome.equals("0")){
                break;
            }
            System.out.println("Informe a idade do aluno: ");
            idade = scan.nextInt();
        }

    }

}
