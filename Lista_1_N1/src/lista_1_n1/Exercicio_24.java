package lista_1_n1;

import java.util.Scanner;

public class Exercicio_24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("insira o numero a ser  verificado");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o numero e par ");
        } else {
            System.out.println("o numero e impar ");
        }
    }
}
