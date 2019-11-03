/*
Faça um programa que leia 5 valores inteiros. 
Conte quantos destes valores digitados 
são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, 
indicando a quantidade de valores pares lidos.
7
-5
6
-4
12
 */

package uri_lab;
import java.util.Scanner;
public class x1065 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cont_par = 0 , n;
        for (int i = 0; i < 5; i++) {
            n = entrada.nextInt();
            if (n  % 2 == 0) {
               cont_par++;
            }
        }
        System.out.println(cont_par + " valores pares");
    }
}
