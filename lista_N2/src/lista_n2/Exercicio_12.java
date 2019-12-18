/*
12. Faça um programa que leia dois números inteiros positivos (n1 e n2). Repita a leitura
até que n1 seja menor que n2, quando n2 for maior que n1, imprima os números entre
n1 e n2.
 */

package lista_n2;
import java.util.Scanner;
public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1 = 0 , n2 = 0 , cont;
        do {
            System.out.println("digite o primeiro numero");
            n1 = entrada.nextInt();
            System.out.println("digite o segundo numero ");
            n2 = entrada.nextInt();
        } while (n1 < n2);
        if (n1 < n2 ) {
            System.out.println("o primeiro numero e menor qie o segundo ");
        }
        
    }
}
