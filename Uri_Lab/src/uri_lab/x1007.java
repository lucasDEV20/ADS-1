/*
Leia quatro valores inteiros A, B, C e D. A seguir, 
calcule e mostre a diferença do produto de 
A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as 
letras maiúsculas, conforme exemplo abaixo, 
com um espaço em branco antes e depois da igualdade.

Exemplos de Entrada	Exemplos de Saída
5                       DIFERENCA = -26
6
7
8

0                       DIFERENCA = -56
0
7
8

5                       DIFERENCA = 86
6
-7
8


 */
package lista_uri;

import java.util.Scanner;


public class x1007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
    //Leia quatro valores inteiros A, B, C e D.
    int A,B,C,D ,DIFERENCA;
    A = entrada.nextInt();
     B = entrada.nextInt();
      C = entrada.nextInt();
       D = entrada.nextInt();
     //segundo a fórmula: DIFERENCA = (A * B - C * D)
       DIFERENCA = (A * B - C *D);
       //SAIDA  
       System.out.println("DIFERENCA = "+DIFERENCA);
  }
}
