/*
 Escreva um programa que leia dois valores X e Y. 
 A seguir, mostre uma sequência de 1 até Y, 
 passando para a próxima linha a cada X números.

 Entrada
 O arquivo de entrada contém dois valores inteiros,
 (1 < X < 20) e (X < Y < 100000).

 Saída
 Cada sequência deve ser impressa em uma linha apenas,
 com 1 espaço em branco entre cada número,
 conforme exemplo abaixo. Não deve haver espaço em branco 
 após o último valor da linha.
 */
package uri_lab;

import java.util.Scanner;

public class x1145 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i, k, m;
        i = entrada.nextInt();
        n = entrada.nextInt();

        m = i;
        k = 1;
        for (; k <= n; i = m) {

            for (; i > 0; i--, k++) {

                if (k <= n) {
                    System.out.print((i == 1) ? k + "\n" : k + " ");
                } else {
                    System.out.println();
                }
            }
        }

    }
}
