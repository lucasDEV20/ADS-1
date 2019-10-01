/*
44. Escreva um algoritmo que leia o código de um determinado produto e mostre
 * a sua classificação de acordo com a tabela apresentada a seguir:
 */

package lista_1_n1;

import java.util.Scanner;


public class Exercicio_44 {
    public static void main(String[] args) {
     
        for (int i = 0; i < 30; i++) {
            metodo();
        }
    }

    public static void metodo() {

        Scanner entrada = new Scanner(System.in);
        String codigo, classificacao;

        System.out.println();
        System.out.print("Digite o código do produto: ");
        codigo = entrada.nextLine();

        if (codigo.equals("1")) {
            classificacao = "Alimento não-perecível";
        } else if (codigo.equals("2") || codigo.equals("3") || codigo.equals("4")) {
            classificacao = "Alimento perecível";
        } else if (codigo.equals("5") || codigo.equals("6")) {
            classificacao = "Vestuário";
        } else if (codigo.equals("7")) {
            classificacao = "Higiene Pessoal";
        } else if (codigo.equals("8") || codigo.equals("9") || codigo.equals("10")
                || codigo.equals("11") || codigo.equals("12") || codigo.equals("13")
                || codigo.equals("14") || codigo.equals("15")) {
            classificacao = "Limpeza e utensílios domésticos";
        } else {
            classificacao = "invalido";
        }

        if (classificacao.equals("invalido")) {
            System.out.println("Código inválido!");
        } else {
            System.out.printf("Classificação . . . . . . : %s\n", classificacao);
        }
    }
} 

