/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_40 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("qual a sua idade");
        idade = entrada.nextInt();

        if (idade >= 16) {
            if (idade < 18 || idade >= 65) {
                String classe_eleitor = "ELEITOR FACULTATIVO";
            } else if (idade >= 18 && idade < 65) {
                String classe_eleitoral = "ELEITOR OBRIGATÓRIO";
                System.out.println();
                System.out.printf("Sua classe eleitoral: %s\n", classe_eleitoral);
            } else {
                System.out.println("Idade inválida!");
            }
        }
    }
}
