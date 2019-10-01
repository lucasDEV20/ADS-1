/*
Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano,
P(x1,y1) e P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
 */
package lista_lab_101;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner eq = new Scanner(System.in);
        float  ponto1 , ponto2 , distancia;
        System.out.println("Insira o valor do ponto 1 :");
        ponto1 = eq.nextFloat();
        System.out.println("Insira o valor do ponto 2 :");
        ponto2 = eq.nextFloat();
        distancia = (float) Math.sqrt( Math.pow(ponto1 - ponto2,2)/2);
        
        System.out.println("a distancia dos pontos e "+distancia);
    }   
}
