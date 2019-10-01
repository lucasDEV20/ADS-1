/*
 Faça um programa que leia uma data (dia, mês e ano, em uma variável inteira cada), e
 escreva a mesma data no formato dia de (mês por extenso) de ano.
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_39 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano, dia, mes = 0 ,menu = 0;
        
        System.out.println();
        System.out.println("insirao dia ");
        dia = entrada.nextInt();
        System.out.println("qaul o mes");
        mes = entrada.nextInt();
        menu = entrada.nextInt();
        
        
        System.out.println("insira o ano ");
        ano = entrada.nextInt();
        System.out.println();
        switch (menu) {
            case '1':
                System.out.println(dia + " de janeiro " + " de " + ano + " ");
                break;
            case '2':
                System.out.println(dia + " de fevereiro" + " de " + ano + " ");
                break;
            case '3':
                System.out.println(dia + " de maio " + " de " + ano + " ");
                break;
            case '4':
                System.out.println(dia + " de abril " + " de " + ano + " ");
                break;
            case '5':
                System.out.println(dia + " de março" + " de " + ano + " ");
                break;
            case '6':
                System.out.println(dia + " de junho " + " de " + ano + " ");
                break;
            case '7':
                System.out.println(dia + " de julho " + " de " + ano + " ");
                break;
            case '8':
                System.out.println(dia + " de agosto" + " de " + ano + " ");
            case '9':
                System.out.println(dia + " de setembro " + " de " + ano + " ");
                break;
            default:
                if (mes == 10) {
                    System.out.println(dia + " de outubro " + " de " + ano + " ");
                }
                if (mes == 11) {
                    System.out.println(dia + " de novenbro " + " de " + ano + " ");
                } else {
                    if (mes == 12) {
                        System.out.println(dia + " de dezenbro " + " de " + ano + " ");

                    }
                }
        }
    }
}
