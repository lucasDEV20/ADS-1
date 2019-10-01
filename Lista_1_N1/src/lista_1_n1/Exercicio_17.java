/*
Faça um programa que leia via teclado um valor, em dólares, e a cotação do dólar; converta
e imprima o mesmo num valor em reais.
 */
package lista_lab_101;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
    Scanner conta = new Scanner(System.in);
    double  real , dolar , cotaçao = 1 , conversao = 1;
    
        System.out.println("informe o valor da valor do dolar :");
        dolar = conta.nextDouble();
        System.out.println("informe o valor da cotaçao do dolar :");
        cotaçao = conta.nextDouble();
        
        conversao = dolar * cotaçao;
        System.out.println("o valor em dolar e "+dolar+"$");
        System.out.println("A quantidade de dólar convertido em real é: R$"+conversao);
        
        
        
    }
    
}
