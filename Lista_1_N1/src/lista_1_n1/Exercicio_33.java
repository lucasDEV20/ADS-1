/*
 Escreva um programa que leia o nome, o peso de uma pessoa na Terra e o número de
 um planeta e imprima o valor do peso desta pessoa neste planeta. A relação de planetas é
 dada a seguir juntamente com o valor das gravidades relativas á Terra:

 Opção Gravidade Relativa Planeta
 1  Mercúrio 0,37
 2  Vênus   0,88
 3  Marte 0,38
 4  Júpiter 2,64
 5 Saturno 1,15 
 6  Urano 1,17
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_33 {

    public static void main(String[] args) {
        Scanner planet = new Scanner(System.in);
        char menu;
        String nome;
        double peso;
        System.out.println();
        System.out.println("Insira o seu nome para poder continuar :");
        nome = planet.nextLine();
        System.out.println(nome + " , Insira o seu peso :");
        peso = planet.nextDouble();
        System.out.println();
        System.out.println("============================================");
        System.out.println(nome + "\nFAVOR ESCOLHER UMA OPÇAO PARA PROSEGUIR:\n");
        System.out.println("=============================================");
        System.out.println("(1) - Mercúrio");
        System.out.println("(2) - Vênus");
        System.out.println("(3) - Marte");
        System.out.println("(4) - Júpiter");
        System.out.println("(5) - Saturno");
        System.out.println("(6) - Urano");
        System.out.println("(0) - sair");
        System.out.println("============================================");
        menu = planet.next().toLowerCase().charAt(0);
        System.out.println();

        switch (menu) {
            case '1':
                peso = (peso * 0.37);
                System.out.println();
                System.out.println(nome + ", seu peso em mercurio e igual a " + peso + "kg");
                System.out.println();
                break;
            case '2':
                peso = (peso * 0.88);
                System.out.println();
                System.out.println(nome + ", seu peso em venus e igual a" + peso + "kg");
                System.out.println();
                break;
            case '3':
                peso = (peso * 0.38);
                System.out.println();
                System.out.println(nome + ", seu peso em marte e" + peso + "kg");
                System.out.println();
                break;
            case '4':
                peso = (peso * 2.64);
                System.out.println();
                System.out.println(nome + ", seu peso em jupter e " + peso + "kg");
                System.out.println();
                break;
            case '5':
                peso = (peso * 1.15);
                System.out.println();
                System.out.println(nome + ", seu peso em saturno e " + peso + "kg");
                System.out.println();
                break;
            case '6':
                peso = (peso * 1.17);
                System.out.println();
                System.out.println(nome + ", seu peso em urano e " + peso + "kg");
                System.out.println();
                break;
            case '0':
                System.out.println();
                System.out.println("saindoooooooooooooooo");
                System.out.println();
            default:
                System.out.println();
                System.out.println(nome + " \nDIGITE UMA OPÇAO VALIDA\n");
                System.out.println();
        }
    }

}
