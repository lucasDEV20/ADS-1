/*
Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto
variável em % informado pelo vendedor. Escreva um programa que leia o valor original do
produto e o valor do desconto oferecido pelo vendedor e imprima o novo valor do produto.
*/

package lista_1_n1;

import java.util.Scanner;
public class Exercicio_07 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    float valorori , desconto , novovalor ;
    //desconto , vai ser o desconto que o vendedor ira passar
    //valorori , o valor do produto sem alteraçao pelo desconto 
    //novovalor , valor apos a incorporaçao do desconto do vendedor
    //--------------------------------------------------------------
    //entrada de dados 
        System.out.println("Vendedor, imforme o preço original do produto escolhido pelo cliente :");
        valorori = entrada.nextInt();
        System.out.println("O valor do produto e R$"+valorori);
        System.out.println("Vendedor, imforme o valor do desconto a ser dado :");
        desconto = entrada.nextFloat();
        System.out.println("O valor do desconto e de : "+desconto+"%");
    // processamento 
        novovalor = valorori - desconto;
       
    //saida
        System.out.println("O vaalor do produto sem desconto e : R$"+valorori+" , e o valor do dezconto e de : "+desconto+"%");
        System.out.println("O valor do produto com desconto e de : R$"+novovalor);
    }
}
