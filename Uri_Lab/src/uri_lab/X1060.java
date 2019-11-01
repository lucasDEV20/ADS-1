/*
 Faça um programa que leia 6 valores. 
 Estes valores serão somente negativos ou positivos 
 (desconsidere os valores nulos). 
 A seguir, mostre a quantidade de 
 valores positivos digitados.

 Entrada
 Seis valores, negativos e/ou positivos.

 Saída
 Imprima uma mensagem dizendo quantos valores positivos foram lidos.

 Exemplo de Entrada	Exemplo de Saída
 7                       4 valores positivos
 -5
 6
 -3.4
 4.6
 12
 */
package lista_uri;

import java.util.Scanner;

public class X1060 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num;
        int cont = 0;
        for (int i = 0; i < 6; i++) {

            num = entrada.nextDouble();

            if (num > 0) {

                cont++;

            } else if (num < 0) {

            }
         
        }
        
       System.out.printf("%d valores positivos",cont);
    }
}
