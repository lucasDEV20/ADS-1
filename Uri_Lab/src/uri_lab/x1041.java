/* 
 Leia 2 valores com uma casa decimal (x e y), que devem representar as
 coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
 qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
 (x = y = 0).
 Se o ponto estiver na origem, escreva a mensagem “Origem”.
 Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
 Entrada
 A entrada contem as coordenadas de um ponto.
 Saída
 A saída deve apresentar o quadrante em que o ponto se encontra.
 */
package uri_lab;

import java.util.Scanner;

public class x1041 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declarando variaveis
        double valor_x, valor_y;
        //prenchendo variaveis 
        valor_x = entrada.nextDouble();
        valor_y = entrada.nextDouble();
        /* processando variaveis , x e y 
         dando valor aos eixos e suas determinadas 
         condiçoes 
         */
        if ((valor_x == 0) & (valor_y == 0)) {
            System.out.println("Origem");

        } else if (valor_y == 0) {
            System.out.println("Eixo X");

        } else if (valor_x == 0) {
            System.out.println("Eixo Y");
            /*definindo pontos 
             q1 , q2 , q3 , q4
             */
        } else if ((valor_x > 0) & (valor_y > 0)) {
            System.out.println("Q1");
        } else if ((valor_x < 0) & (valor_y > 0)) {
            System.out.println("Q2");
        } else if ((valor_x < 0) & (valor_y < 0)) {
            System.out.println("Q3");
        } else if ((valor_x > 0) & (valor_y < 0)) {
            System.out.println("Q4");
        }

    }
}
