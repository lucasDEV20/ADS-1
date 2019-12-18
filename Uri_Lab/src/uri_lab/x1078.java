/*
 Leia 1 valor inteiro N (2 < N < 1000). 
 A seguir, mostre a tabuada de N:      I
 1 x N = N      2 x N = 2N        ...       10 x N = 10N

 Entrada
 A entrada contém um valor inteiro N (2 < N < 1000).

 Saída
 Imprima a tabuada de N, conforme o exemplo fornecido.
 */
package uri_lab;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class x1078 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        num = entrada.nextInt();
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i + " x " + num + " = " + (num * i));

        }
    }
}
