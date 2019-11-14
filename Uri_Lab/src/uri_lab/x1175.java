/*
Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.

Exemplo de Entrada	Exemplo de Saída
0
-5
...
63
230

N[0] = 230
N[1] = 63
...
N[18] = -5
N[19] = 0


 */

package uri_lab;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class x1175 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int N[] = new int[20];
        
        for (int i = 0; i < N.length; i++) {
            N[i] = entrada.nextInt();
  
        }
        int indicifinal = N.length - 1 ;
        for (int i = 0; i < N.length / 2 ; i++) {
            int auxiliar = N[i];
            N[i] = N[indicifinal];
            N[indicifinal] = auxiliar;
            indicifinal--;
            
        }
        for (int i = 0; i < N.length; i++) {
            System.out.println("N["+ i +"] = "+N[i]);
        }
    }
}
