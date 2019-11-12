/*
 51. Escreva um programa que leia dois vetores –
 V1 e V2 – cada um com N(N<=10)
 valores reais e um terceiro vetor –
 Op - com N valores do tipo caracter. Seu programa

 deve gerar um vetor – 
 Resul como sendo o resultado das operações de V1 com V2, onde
 o código da operação está no vetor Op nas respectivas posições.
 V1

 4 7 10 12 3

 V2

 8 13 10 18 30

 Op

 + - * + *

 Resul

 12 -6 100 30 90
 */
package lista_N2;

import java.util.Scanner;

public class Exercicio_51 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho = 10;
        double vet1[] = new double[tamanho];
        double vet2[] = new double[tamanho];
        double vetor_real[] = new double[tamanho];
        char operador[] = new char[tamanho];
        double[] resul = new double[tamanho];
        boolean sair = false;
        for (int i = 0; i >= 10; i++) {
            System.out.println("¨¨PRIMEIRO¨¨VETOR¨¨");
            System.out.println("INSIRA O PRIMEIRO VALOR NA POSIÇAO" + i);
            vet1[i] = entrada.nextDouble();
            System.out.println("¨¨SEGUNDOO¨¨VETOR¨¨");
            System.out.println("INSIRA O SEGUNDO VALOR NA POSIÇAO" + i);
            vet2[i] = entrada.nextDouble();

        }
        do {

            for (int i = 0; i < 10; i++) {
                operador[i] = entrada.next().charAt(0);
                if (operador[i] == 0) {
                    if ((operador[i] == '+') || (operador[i] == '-') || (operador[i] == '*')) {
                    }
                    sair = true;
                } else {
                    if ((operador[i] == '+') || (operador[i] == '-') || (operador[i] == '*') || (operador[i] == '/')) {
                    }
                }
            }
        } while (!sair);
        for (int j = 0; j < 10; j++) {

            switch (operador[j]) {
                case '+':
                    resul[j] = vet1[j] + vet2[j];
                    break;

                case '-':
                    resul[j] = vet1[j] - vet2[j];
                    break;

                case '*':
                    resul[j] = vet1[j] * vet2[j];
                    break;

                case '/':
                    resul[j] = vet1[j] / vet2[j];
                    break;
                default:
                   
            }
            
        }           System.out.println("{ "+vet1+" }");
                    System.out.println("{ "+vet2+" }");
                    System.out.println("{ "+operador+" }");
                    System.out.println("{ "+resul+" }");
    }

}
