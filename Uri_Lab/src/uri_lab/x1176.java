/*
 Faça um programa que leia um valor e apresente o número de 
 Fibonacci correspondente a este valor lido. 
 Lembre que os 2 primeiros elementos da série de 
 Fibonacci são 0 e 1 e cada próximo termo
 é a soma dos 2 anteriores a ele. 
 Todos os valores de Fibonacci calculados 
 neste problema devem caber em
 um inteiro de 64 bits sem sinal.

 Entrada
 A primeira linha da entrada contém um inteiro T,
 indicando o número de casos de teste. 
 Cada caso de teste contém um único 
 inteiro N (0 ≤ N ≤ 60), 
 correspondente ao N-esimo termo da série de Fibonacci.

 Saída
 Para cada caso de teste da entrada,
 imprima a mensagem 
 "Fib(N) = X",
 onde X é o N-ésimo termo da série de Fibonacci.
 */
package uri_lab;

import java.util.Scanner;

public class x1176 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, teste, i = 0;
        int fibonacci[] = new int[61];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        teste = entrada.nextInt();
        for (int j = 0; j < teste; j++) {
            num = entrada.nextInt();
            for (i = 2; i < 61; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                if (num == 0) {
                    System.out.print("Fibonacci(" + 0 + ") = " + 0 + "\n");
                    break;
                } else if (num == 1) {
                    System.out.print("Fibonacci(" + 1 + ") = " + 1 + "\n");
                    break;
                }
                if (i == num) {
                    System.out.print("Fibonacci(" + i + ") = " + fibonacci[i] + "\n");
                }

            }
        }

    }
}
