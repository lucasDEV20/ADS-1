/*
 37. Construa um programa que receba a idade de uma pessoa e classifique-a seguindo o
 critério apresentado a seguir. Considere a idade é um valor inteiro e que será informada de
 forma válida.
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_37 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Favor inserir a  idade");
        idade = entrada.nextInt();
        if (idade > 0 || idade < 2) {
            System.out.println("RECEN NASCISDO");
        }
        if (idade < 3) {
            System.out.println("RECEN NASCIDO");
        }
        if (idade >= 3) {
            System.out.println("CRIANÇA");
        }
        if (idade <= 11) {
            System.out.println("CRIANÇA");
        }
        
        if (idade >= 11) {
            System.out.println("adolecente");
        }
        if (idade >= 12) {
            System.out.println("adolecente");    
            }
        if (idade <= 19) {
            System.out.println("adolecente");
            }
        if (idade >= 20) {
            System.out.println("ADULTO");
        }
        if (idade >= 55 ) {
            System.out.println("ADULTO");
        }else{
             System.out.println("IDOSO");
        }

    }
}

