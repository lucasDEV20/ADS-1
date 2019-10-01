/*
22. Escreva um programa que receba um número inteiro de 3 dígitos e imprima o dígito das
Centenas, o dígito das Dezenas e o dígito das Unidades. Em seguida, o programa deverá
inverter o número recebido, isto é, se o usuário digitou 123, seu programa deverá gerar o
número 321.
 */

package lista_1_n1;

import java.util.Scanner;
public class Exercicio_22 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int u = 0 , d = 0, c = 0, numero ;
        System.out.println("insira a unidade ");
        u = entrada.nextInt();
        System.out.println("insira a dezena ");
        d = entrada.nextInt();
        System.out.println("insira a centena ");
        c = entrada.nextInt();
        numero = c*100+d*10+u*1;
        System.out.println("o numero invertido e : "+ numero);
        
        
    }
 
}
