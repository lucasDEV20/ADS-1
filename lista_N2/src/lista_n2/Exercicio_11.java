/*
 Escreva um programa que leia uma quantidade inteira N e, em seguida, leia N valores
 double. Calcule e informe a média dos N valores lidos.
 */
package aulaads_1;

import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0, num_inteiro = 0;
        double num_double = 0 , media;
        do {
            System.out.println("INSIRA UM NUMERO INTEIRO");
            num_inteiro = entrada.nextInt();
            System.out.println("INSIRA UM NUMERO REAL (DOUBLE)");
            num_double = entrada.nextDouble(); 
            media = num_inteiro + num_double /2;
            cont++;
            System.out.println("para sair do programa digite 0 ");
            System.out.println("A MEDIA DOS NUMEROS FORNECIDOS E "+media);
        } while (num_inteiro > 0 || num_double > 0);
        System.out.println("fim da execuçao do programa ");
    }
}
