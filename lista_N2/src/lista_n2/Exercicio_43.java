/*
43. Faça um programa que preencha um vetor com 10 números inteiros. Calcule e mostre os
números superiores a 50 e suas respectivas posições. O programa deverá mostrar uma
mensagem se não existir nenhum número nessa condição.
 */
package lista_N2;

import java.util.Random;
import java.util.Scanner;
/**
e la vamos nos vetor
* 
 */
public class Exercicio_43 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num[] = new int[10];
        System.out.print("vetor 1 = ");
        for (int i = 0; i < num.length; i++) {
           
            num[i] = sorteia(0,100);
            System.out.print(num[i]+" ");
            
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 50) {
                System.out.println(num[i]+" e maior que 50");
            }else  {
               if (num[i] < 50) {
                   System.out.println(num[i]+" nao e maior que 50");   
               } 
            }
        }
    }
  
        
    public static int sorteia(int limiteInferior, int limiteSuperior)
	{
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
