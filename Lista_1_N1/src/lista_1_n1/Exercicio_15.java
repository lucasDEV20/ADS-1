/*
15. Faça um algoritmo que leia x e y e resolva a equação abaixo:

Eq = 2 ∗ √3 + 30 + (y − 32)
             3



 */
package lista_lab_101;

import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float eq , x , y;
        System.out.println("informe o vaior de x ");
        x = entrada.nextFloat();
        System.out.println("informe o valor de y ");
        y = entrada.nextFloat();
        
        eq = (float) (2 * Math.sqrt(x + 30 + (y - 32))/3);
        
        System.out.println("o valor da equaçao e "+eq);
    }
}
