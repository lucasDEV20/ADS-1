/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_N2;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int MAXLIN = 3, MAXCOL = 3, soma = 0, cont = 0;
        double media = 0;
        int[][] matriz = new int[MAXLIN][MAXCOL];
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                System.out.println();
                System.out.println("=====================================================================================================");
                System.out.println("informe a matriz[" + i + "]" + "[" + j + "}: ");
                matriz[i][j] = entrada.nextInt();
                System.out.println("=====================================================================================================");
                while (matriz[i][j] < 0) {
                    System.out.println("=====================================================================================================");
                    System.out.println("informe apenas valores positivos! ");
                    System.out.println("informe a matriz[" + i + "]" + "[" + j + "}: ");
                    System.out.println("=====================================================================================================");
                    matriz[i][j] = entrada.nextInt();

                }
                soma += matriz[i][j];
                cont++;
            }
        }
        int maior = matriz[0][0];
        int linMaior = 0, colMaior = 0;
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linMaior = i;
                    colMaior = j;

                }

            }
        }
        int menor = matriz[0][0];
        int linMenor = 0, colMenor = 0;
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linMenor = i;
                    colMenor = j;
                }
            }
        }

        System.out.println();
        System.out.println("=====================================================================================================");
        System.out.println("\n\nMaior eelemento da matriz é o " + maior + " na posiçao[" + linMaior + "]" + "[" + colMaior + "]\n");
        System.out.println("\n\nMenor eelemento da matriz é o " + menor + " na posiçao[" + linMenor + "]" + "[" + colMenor + "]\n");
        System.out.println("=====================================================================================================");
        System.out.println("impresao da matriz em formato matricial");
        System.out.println("=====================================================================================================");
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                System.out.print(matriz[i][j] + "\t");
        

            }
            System.out.println();
        }
        media = soma / cont;
        System.out.println();
        System.out.println("=====================================================================================================");
        System.out.println("A media e " + media);
        System.out.println("=====================================================================================================");
    }
}
