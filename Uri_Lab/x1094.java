/*
 Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa 
 de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. 
 Ela quer saber no final do ano,quantas cobaias foram utilizadas no laboratório 
 e o percentual de cada tipo de cobaia utilizada.

 Este laboratório em especial utiliza três tipos de cobaias: 
 sapos, ratos e coelhos. Para obter estas informações,
 ela sabe exatamente o número de experimentos que foram realizados, 
 o tipo de cobaia utilizada 
 e a quantidade de cobaias utilizadas em cada experimento.

 Entrada
 A primeira linha de entrada contém um valor inteiro N
 que indica os vários casos de teste que vem a seguir.
 Cada caso de teste contém um inteiro Quantia 
 (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas
 e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

 Saída
 Apresente o total de cobaias utilizadas, 
 o total de cada tipo de cobaia utilizada 
 e o percentual de cada uma em relação ao total de cobaias utilizadas, 
 sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

 Exemplo de Entrada	Exemplo de Saída
                       Total: 92 cobaias
                     Total de coelhos: 29
                      Total de ratos: 40
                     Total de sapos: 23
                      Percentual de coelhos: 31.52 %
                     Percentual de ratos: 43.48 %
                      Percentual de sapos: 25.00 %
 
 
 
 
 */
package uri_lab;

import java.util.Scanner;

public class x1094 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //valores de teste
        int n;
        //cont de cobaias
        int cont, total = 0, total_C = 0, total_R = 0, total_S = 0;
        //animal
        String animal;
        //percent animal
        float percent_coelho = 0, percent_rato = 0, percent_sapo = 0;
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            cont = entrada.nextInt();
            animal = entrada.next();
            total += cont;
            if (animal.equals("C")) {
                total_C += cont;
            } else if (animal.equals("R")) {
                total_R += cont;
            } else if (animal.equals("S")) {
                total_S += cont;
            }
            percent_coelho = (float) ((total_C * 100.00) / total);
            percent_rato = (float) ((total_R * 100.00) / total);
            percent_sapo = (float) ((total_S * 100.00) / total);
        }
        System.out.print("Total: " + total + " cobaias\n");
        System.out.print("Total de coelhos: " + total_C + "\n");
        System.out.print("Total de ratos: " + total_R + "\n");
        System.out.print("Total de sapos: " + total_S + "\n");

        System.out.printf("Percentual de coelhos: %.2f", percent_coelho);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", percent_rato);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", percent_sapo);
        System.out.print(" %\n");
    }

}
