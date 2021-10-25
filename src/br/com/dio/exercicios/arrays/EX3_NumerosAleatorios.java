package br.com.dio.exercicios.arrays;

/*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final, mostre os números e seus sucessores. */

import java.util.Random;

public class EX3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[20];
        int i, sucessor, antecessor;
        int limite = numeros.length;

        for (i=0; i<limite; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }
        for (int n : numeros){
            sucessor = n + 1;
            antecessor = n - 1;
            System.out.print("O numero digitado foi " + n + ", ");
            System.out.print("o sucessor dele é " + sucessor + " e o ");
            System.out.print("antecessor dele é " + antecessor + ".\n");
        }
    }
}
