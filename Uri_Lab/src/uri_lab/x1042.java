/*
 Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

 Entrada
 A entrada contem três números inteiros.

 Saída
 Imprima a saída conforme foi especificado
 */
package uri_lab;

import java.util.Scanner;

public class x1042 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        //entrada de dedos 
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        //processamento de dados 
        if ((a < b) & (b < c)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((a < c) & (c < b)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((b < a) & (a < c)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((b < c) & (c < a)) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((c < a) & (a < b)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
       //saida de dados 
        System.out.println("\n" + a);
        System.out.println(b);
        System.out.println(c);

    }

}
