 /*
Escreva um programa que receba quatro números e imprima a média ponderada,
sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_12 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    float num1 , num2 , num3 ,  num4 , media ;
        System.out.println();
        System.out.println("Escreva o primeiro numero :  ");
        num1 = entrada.nextFloat();
        System.out.println("Escreva o segundo numero :   ");
        num2 = entrada.nextFloat();
        System.out.println("Escreva o terceiro numero :  ");
        num3 = entrada.nextFloat();
        System.out.println("Escreva o quarto numero :   ");
        num4 = entrada.nextFloat();
        media = ((num1 * 1) + (num2 * 2) + (num3 * 3) +(num4 * 4))/10;
        
        System.out.println("A media e :"+media);
        
        
    }
   
}
