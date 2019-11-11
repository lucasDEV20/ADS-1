/*
 Faça um programa que leia um vetor com 10 elementos inteiros e um segundo vetor
 com 5 números inteiros. Calcule e mostre dois vetores resultantes. O primeiro vetor
 resultante será composto pelos números pares gerados pelo elemento do primeiro vetor
 somado a todos elementos do segundo vetor. O segundo vetor resultante será composto
 pelos números ímpares gerados pelo elemento do primeiro vetor somado a todos os
 elementos do segundo vetor.
 Primeiro vetor = [ 4 7 5 8 2 15 9 6 10 11]
 Segundo vetor = [ 3 4 5 8 2 ]
 Primeiro vetor resultante = [26 30 . . . ], sendo 26 = 4+3+4+5+8+2, 30 =
 8+3+4+5+8+2, . . .
 Segundo vetor resultante = [29 27 . . . ], sendo 29 = 7+3+4+5+8+2, 27 =
 5+3+4+5+8+2, . .
 */
package lista_N2;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Exercicio_50 {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int[] vetor2 = new int[5];

        int[] result1 = new int[10];
        int[] result2 = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteia(1, 50);

        }
        int soma = 0;
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sorteia(1, 50);
            soma = soma + vetor2[i];

        }
        int j = 0, k = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                result1[j] = vetor[i] + soma;
                j++;
            } else {
                result2[k] = vetor[i] + soma;
                k++;
            }
        }

        System.out.print("Primeiro vetor = [ ");
        imprimeVetor(vetor);

        System.out.print("]");
        System.out.println("\n");
        System.out.print("Segundo vetor = [  ");
        imprimeVetor(vetor2);
        System.out.print("]");
        System.out.println("  ");
        

        System.out.print("\nPrimeiro vetor resultante = [ ");
        
        for (int i = 0; i < j; i++) {

            System.out.print(result1[i] + " , ");

        }
        System.out.print("]\n");
        System.out.print("\nSegundoo vetor resultante = [");
        for (int i = 0; i < k; i++) {
            System.out.print(result2[i] + " , ");

        }
        System.out.print("]\n");
    }

    public static int imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 3 == 0) {
                // quando completar 2 posições
                // resultado ira quebrar em 25

            }
            System.out.printf(vetor[i] + " , ");

        }
        return 0;

    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }
}
