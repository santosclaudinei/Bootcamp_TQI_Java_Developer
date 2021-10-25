package br.com.dio.exercicios.arrays;

/* Faça um Programa que leia um vetor de 5 números
inteiros e mostre-os na ordem inversa. */

public class EX1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 5, -8, 7, 2, -4, 15};
        int count = 0;
        int inverse;
        inverse = vetor.length - 1;

        System.out.println("A ordem inversa do nosso vetor é:");
        while (count <= (vetor.length - 1)){
            System.out.print(vetor[inverse] + " ");
            inverse --;
            count ++;
        }

    }
}
