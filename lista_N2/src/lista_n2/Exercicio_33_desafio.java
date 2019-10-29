/*
 O IBOPE encomendou-lhe um programa para registrar as pesquisas das eleições entre
 os candidatos 1, 2 e 3. Faça um programa que dado o candidato escolhido (1, 2 ou 3), a
 idade e o sexo do eleitor(a) (1-mulher, 2-homem), para um número indeterminado de
 eleitores, calcule e escreva:
 a) Qual o candidato mais votado
 b) Qual a média de idade entre os eleitores do candidato mais votado
 c) Qual o candidato preferido dos homens
 */
package lista_N2;

import java.util.Scanner;

/**
 * e la vamos nos mais uma vez
 */
public class Exercicio_33_desafio {

    public static void main(String[] args) {
        Scanner desafio = new Scanner(System.in);
        //varivel candidato
        int idade, soma_idade = 0, quant_homen = 0, candidato_1 = 0, candidato_2 = 0, candidato_3 = 0, numero_votos, maior = 0;
        int homen1 = 0 , homen2 = 0, homen3 = 0, homen_mais_votado;
        String candidato = null;
        double media_idade = 0;
        //opcao de saida
        String opcao, sexo;
        do {
            System.out.println();
            System.out.println("===================================================");
            System.out.println("=======================IBOPE=======================");
            System.out.println("Escolha um dos candidatos a seguir (1 , 2 , 3");
            candidato = desafio.nextLine();
            if (candidato.equalsIgnoreCase("1")) {
                candidato_1++;
                homen1++;
            }
            if (candidato.equalsIgnoreCase("2")) {
                candidato_2++;
                homen2++;
            }
            if (candidato.equalsIgnoreCase("3")) {
                candidato_3++;
                homen3++;
            }
             if (homen1) {
                
            }

            System.out.println("Qual a idade do eleitor");
            idade = desafio.nextInt();
            soma_idade = soma_idade + idade;
            desafio.nextLine();
            System.out.println("qual o sexo do usuario (1-mulher, 2-homem)");
            sexo = desafio.nextLine();

            if (sexo.equalsIgnoreCase("2")) {
                quant_homen++;
            }
            media_idade = ((soma_idade) / (candidato_1+candidato_2+candidato_3));

            if (candidato_1 > maior) {
                maior = candidato_1;
            }
            if (candidato_2 > maior) {
                maior = candidato_2;
            }
            if (candidato_3 > maior) {
                maior = candidato_3;
            }
            //saida
            System.out.println("Deseja sair do programa ? (sim/nao)");
            opcao = desafio.nextLine();

        } while (opcao.equalsIgnoreCase("nao"));
        numero_votos = candidato_1 + candidato_2 + candidato_3;

        System.out.printf("o mais vototado e %d \n", maior);

        System.out.printf("o numero de votos e %d \n", numero_votos);

        System.out.printf("a media de idades dos eleitores é %.2f \n", media_idade);

        System.out.printf("a quantidade de homens e : %d \n", quant_homen);
    }

}
