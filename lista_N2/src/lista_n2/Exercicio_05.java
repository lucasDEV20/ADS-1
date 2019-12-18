/*
 5. Faça um programa que leia um número indeterminado de números, calcule e mostre a
 soma dos números digitados, a quantidade de números digitados e a média dos números
 digitados.
 */
package lista_n2;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quant, numero = 0, soma = 0, cont = 1, media = 0;
        //entrada da quantidade de numeros 
        System.out.println("favor inserir quantos numeros serao verificados ");
        quant = entrada.nextInt();
        //while que vai repitir a partir da quantidade d e vezes que usuario desejar
        while (cont <= quant) {
            System.out.println();
            System.out.println("=======================================================");
            System.out.println("insria o numero ");
            numero = entrada.nextInt();
            //entrada do numero 
            //a partir do numeros teremos o valor a ser somado
            //repitindo e claro quantas vezes o usuario desejar 
            soma = numero + numero;
            //soma do numero 
            cont++;
            //dando valor a media 
            media = soma/numero;
            //adquirindo a media a partir da soma do numero , fornecido pelo usuario
            
        }
        //saida da soma dos numeros 
        System.out.println("a soma dos numeros e "+ soma);
        //saida da media dos numeros    
        System.out.println("a media e " + media);
        System.out.println("=======================================================");
        System.out.println();
        //ATENÇAO FALTA A QUATIDADE DE NUMEROS DIGITADOS 
    }
}
