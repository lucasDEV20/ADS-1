/*
 Leia uma quantidade indeterminada de duplas de valores 
 inteiros X e Y. Escreva para cada X e Y uma mensagem 
 que indique se estes valores foram digitados em ordem 
 crescente ou decrescente.

 Entrada
 A entrada contém vários casos de teste. 
 Cada caso contém dois valores inteiros X e Y.
 A leitura deve ser encerrada ao ser fornecido valores 
 iguais para X e Y.

 Saída
 Para cada caso de teste imprima “Crescente”,
 caso os valores tenham sido digitados na ordem crescente, 
 caso contrário imprima a mensagem “Decrescente”.

 Exemplo de Entrada	Exemplo de Saída
 5 4
 7 2
 3 8
 2 2

 Decrescente
 Decrescente
 Crescente 
 */
package uri_lab;

import java.util.Scanner;

public class x1113 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //duplas de valores inteiros X e Y
        int X, Y;
        //a leitura vai ocorrer ate ter valores iguais 
        do {
            X = entrada.nextInt();
            Y = entrada.nextInt();
            //condiçao de numero decrescente
            if (X > Y) {
                System.out.print("Decrescente\n");
            //condiçao de numeros Crescentes
            } else if (X < Y) {
                System.out.print("Crescente\n");
            }
        //A leitura deve ser encerrada ao ser fornecido valores 
        //iguais para X e Y.
        } while (X != Y);

    }
}
