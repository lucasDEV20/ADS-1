/*
 O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde
 para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC =
 peso / (altura)2

 . Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua

 condição.
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_34 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float altura, peso, imc;
        String nome;
        System.out.println();
        System.out.println("insira o seu nome ");
        nome = entrada.nextLine();
        System.out.println(nome + " , informe a sua altura : ");
        altura = entrada.nextFloat();
        System.out.println("informe o seu peso ");
        peso = entrada.nextFloat();
        System.out.println();
        imc = (float) (peso/Math.pow(altura,2.0));
      
        if (imc <= 18.5) {
            System.out.println(nome+", voce esta abaixo do peso");
            if (imc >= 18.5 || imc >= 25) {
                System.out.println(nome +", voce esta com o peso normal ");                
                if (imc >= 25 || imc >= 30) {
                    System.out.println(nome+", voce esta acima do peso ");
                      if (imc >= 30) {
                          System.out.println(nome +" , voce esta obeso");
                    }
                    
                }
            }
            
        }
    }
}
