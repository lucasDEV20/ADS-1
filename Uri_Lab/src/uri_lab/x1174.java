/*
Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

Entrada
A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

Saída
Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
0
-5
63
-8.5
...

A[0] = 0.0
A[1] = -5.0
A[3] = -8.5
...
 */

package uri_lab;
import java.util.Scanner;
public class x1174 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double A[] = new double[100];
        for (int i = 0; i < A.length; i++) {
            A[i] = entrada.nextDouble();
            
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i]<=10) {
                System.out.println("A["+i+"] = "+A[i]);
            }
        }
        
    }
}
