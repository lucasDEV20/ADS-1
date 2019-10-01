/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println();
        System.out.println("Por favor , insira seu nome :");
        nome = entrada.nextLine();
        System.out.println(nome + " , insira a sua idade por favor");
        idade = entrada.nextInt();
        System.out.println();

        if (idade >= 18) {
            System.out.println(nome + ", voce e maior de idade");
        }
        if (idade >= 65) {
            System.out.println(nome + " , voce e um idoso ");
        } else if (idade <= 12) {
            System.out.println(nome + " , voce tem menos que 12 anos ");
        }
    }
}
