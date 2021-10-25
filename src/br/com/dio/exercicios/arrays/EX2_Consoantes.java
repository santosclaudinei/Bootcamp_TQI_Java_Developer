package br.com.dio.exercicios.arrays;

/* Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas. Imprima as consoantes.*/

import java.util.Scanner;

public class EX2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letras = new String[6];
        int contConsoantes = 0;
        int cont = 0;
        int i = 0;

        do {
            System.out.println("Informe a " + (cont+1) + "ª letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")
            )){
                letras[cont] = letra;
                contConsoantes ++;
            }
            cont++;
            }while (cont < letras.length);

        System.out.println("\nAs consoantes inseridas no vetor foram: ");
        for (String let : letras) {
            if (let != null)
                System.out.print(let + " ");
        }

        System.out.println("\nA quantidade de consoantes é: " + contConsoantes);
    }
}
