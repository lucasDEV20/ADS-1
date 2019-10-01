/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista_1_n1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Exercicio_45 {
    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        String categoria, dia, dia_da_semana, texto_saida;
        double preco, desconto, acrescimo;
        boolean continua = true;

        preco = acrescimo = desconto = 0.0;
        texto_saida = dia_da_semana = "";

        // Entrada
        System.out.print("Categoria do DVD [ C=Comum, L=Lancamento ]: ");
        categoria = sc.nextLine();

        if (!categoria.equalsIgnoreCase("C") && !categoria.equalsIgnoreCase("L")) {
            continua = false;
            texto_saida = "Categoria inválida!";
        }

        if (continua) {
            try {
                System.out.print("Preço da locação: ");
                preco = sc.nextDouble();
            } catch (InputMismatchException e) {
                continua = false;
                System.out.println("Preço inválido!");
            }
        }

        if (continua) {
            System.out.println();
            System.out.print("Dias da semana:\n"
                    + " 1 - Domingo\n"
                    + " 2 - Segunda-feira\n"
                    + " 3 - Terça-feira\n"
                    + " 4 - Quarta-feira\n"
                    + " 5 - Quinta-feira\n"
                    + " 6 - Sexta-feira\n"
                    + " 7 - Sábado\n\n"
                    + "Informe o dia da semana: ");
            dia = sc.next();

            // Processamento    
            if (dia.equals("1")) {
                dia_da_semana = "Domingos";
            } else if (dia.equals("2")) {
                dia_da_semana = "Segunda-feira";
                desconto = preco * 0.4;
            } else if (dia.equals("3")) {
                dia_da_semana = "Terça-feira";
                desconto = preco * 0.4;
            } else if (dia.equals("4")) {
                dia_da_semana = "Quarta-feira";
            } else if (dia.equals("5")) {
                dia_da_semana = "Quinta-feira";
                desconto = preco * 0.4;
            } else if (dia.equals("6")) {
                dia_da_semana = "Sexta-feira";
            } else if (dia.equals("7")) {
                dia_da_semana = "Sábado";
            } else {
                continua = false;
                texto_saida = "Valor inválido para o dia da semana!";
            }

            if (continua) {
                if (categoria.equalsIgnoreCase("L")) {
                    acrescimo = preco * 0.15;
                }
                texto_saida = String.format(
                        "\nDia da Semana . : %s\n"
                        + "Categoria do DVD: %s\n"
                        + "Preço final . . : R$ %.2f",
                        dia_da_semana, ((categoria.equalsIgnoreCase("L")) ? "Lançamento" : "Normal"), (preco + acrescimo - desconto));
            }
        }

        // Saída
        System.out.println(texto_saida);
    }
}
