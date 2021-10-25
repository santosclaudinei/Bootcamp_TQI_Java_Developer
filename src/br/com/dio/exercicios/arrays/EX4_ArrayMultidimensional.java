package br.com.dio.exercicios.arrays;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna). */

import java.util.Random;

public class EX4_ArrayMultidimensional {
    public static void main(String[] args) {

        Random random = new Random();
        int i, j;
        int[][] matriz = new int[4][4];
        int tamanho = matriz.length;

        for (i = 0; i < tamanho; i++){
            for (j = 0; j < tamanho; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz 4 x 4: \n");
        for (i=0; i<4; i++){
            System.out.print("Linha " + (i+1) + " -> " + " ");
            for (j=0; j<4; j++){
                System.out.print("[ " + matriz[i][j] + " ]" + " ");
            }
            System.out.println();
        }
    }
}
