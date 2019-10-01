/*
Numa determinada região, o imposto sobre propriedade é calculado a partir de duas
informações:
- área total do terreno (m2).
- área construída do terreno (m2).
O imposto é cobrado da seguinte maneira:
- R$ 5,00 para cada metro quadrado construído.
- R$ 3,80 para cada metro quadrado não construído.
Faça um programa que leia a área total do terreno, a área construída do terreno, calcule e
imprima o valor total a ser pago..
 */

package lista_1_n1;
import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int areatotalterreno , areaconstruida ;
       double metroconstruido , metronaoconstruido , imposto ;
        System.out.println("qual a area total do terreno : ");
        areatotalterreno = entrada.nextInt();
        System.out.println("qual o valor da area construida do terreno : ");
        areaconstruida = entrada.nextInt();
        System.out.println("Informe o valor da area contruida : ");
        metroconstruido = entrada.nextDouble();
        System.out.println("Informe a area nao construida ; ");
        metronaoconstruido = entrada.nextDouble();
        metroconstruido = 5.00;
        metronaoconstruido = 3.80;
        imposto = metroconstruido + metronaoconstruido;
        
        System.out.println("O valor do terreno e ; "+areatotalterreno);
        System.out.println("E o valor a ser pago e : "+imposto+"R$ ");
    }
    
}
