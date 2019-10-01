package lista_1_n1;

import java.util.Scanner;

public class Exercicio_27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, menor, maior, intermediario;
        System.out.println("digite o primeiro numero :");
        a = entrada.nextInt();
        System.out.println("digite o segundo numero :");
        b = entrada.nextInt();
        System.out.println("digite o terceiro numero :");
        c = entrada.nextInt();

        if (a == b && a == c) {
            System.out.println("digite outro numero este estas repitido");
        } else {
            if (a < b && a < c) {
                menor = a;
            } else if (b < a && b < c) {
                menor = b;
            } else {
                menor = c;
            }
            if (a > b && a > b) {
                maior = a;
            } else if (b > a && b > c) {
                maior = b;
            } else {
                maior = c;
            }
            if (a > menor && a < maior) {
                intermediario = a;
            } else if (b > menor && b < maior) {
                intermediario = b;
            } else {
                intermediario = c;
            }
            if (intermediario == menor || intermediario == maior) {
                System.out.printf("O MENOR número é [%d] e MAIOR número é [%d].\n",
                        menor, maior);
            } else {
                System.out.printf(
                        "O menor número é [%d], o número intermediario é [%d] e o menor número é [%d].\n",
                        menor, intermediario, maior);
            }

        }
    }
}
