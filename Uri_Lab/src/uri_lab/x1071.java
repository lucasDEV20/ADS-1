/*
 Leia 2 valores inteiros X e Y. A seguir, 
 calcule e mostre a soma dos números impares entre eles.

 Entrada
 O arquivo de entrada contém dois valores inteiros.

 Saída
 O programa deve imprimir um valor inteiro. 
 Este valor é a soma dos valores ímpares 
 que estão entre os valores fornecidos na 
 ntrada que deverá caber em um inteiro.

 Exemplo de Entrada	Exemplo de Saída
 6                       5     
 -5

 15                      13
 12

 12                      0
 12


 */
package uri_lab;

import java.util.Scanner;

public class x1071 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X, Y, total = 0;
        X = entrada.nextInt();
        Y = entrada.nextInt();

        if (X > Y) {
            for (int i = X - 1; i > Y; i--) {
                if (i % 2 != 0) {
                    total += i;
                }
            }

        } else {
            for (int i = Y - 1; i > X; i--) {
                if (i % 2 != 0) {
                    total += i;

                }
            }

        }
        System.out.print(total + "\n");
    }
}
