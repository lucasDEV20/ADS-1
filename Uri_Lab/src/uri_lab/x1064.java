/*
 Leia 6 valores. Em seguida,
 mostre quantos destes valores digitados foram positivos. 
 Na próxima linha, 
 deve-se mostrar a média de todos os valores positivos digitados, 
 com um dígito após o ponto decimal.
 7
 -5
 6
 -3.4
 4.6
 12

 Entrada
 A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
 Pelo menos um destes números será positivo.

 Saída
 O primeiro valor de saída é a quantidade de valores positivos. 
 A próxima linha deve mostrar a média dos valores positivos digitados.
 */
package lista_uri;

import java.util.Scanner;

public class x1064 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double num , media, n, soma = 0;
        int cont = 0;
        for (int i = 0; i < 6; i++) {

            num = entrada.nextDouble();

            if (num > 0) {
                soma = soma + num;
                cont++;
            }
        }

        media = (soma) / cont;
        System.out.printf("%d valores positivos\n", cont);
        System.out.printf("%.1f\n",media);
    }
}
