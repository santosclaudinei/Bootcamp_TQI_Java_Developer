package br.com.dio.exercicios.loops;

/*Faça um programa que leia 5 números e informe o maior número e a média desses números.*/

import java.util.Scanner;

public class EX3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float nota, somatorio, maior, media;
        int cont;
        cont = 0;
        maior = 0;
        somatorio = 0;

        do {
            System.out.println("Informe uma nota: ");
            nota = scan.nextFloat();
            while(nota > 10.0 || nota < 0){
                System.out.println("Informe uma nota: ");
                nota = scan.nextFloat();
            }
            if(maior < nota) {
                maior = nota;
            }
            somatorio += nota;
            cont++;

        }while (cont < 5);

        media = somatorio / (cont);
        System.out.println("A maior nota é " + maior);
        System.out.println("A média entre as notas é " + media);

    }
}
