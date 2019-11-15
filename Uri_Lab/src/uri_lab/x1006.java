/*
Leia 3 valores, no caso, variáveis A, B e C, 
que são as três notas de um aluno. A seguir, 
calcule a média do aluno, sabendo que a nota A tem peso 2, 
a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 
3 valores com uma casa decimal, 
de dupla precisão (double).

Saída
Imprima a variável MEDIA conforme exemplo
abaixo, com 1 dígito após o ponto decimal e
com um espaço em branco antes e depois da igualdade. 
Assim como todos os problemas, não esqueça de imprimir o
fim de linha após o resultado, caso contrário, 
você receberá "Presentation Error".

Exemplos de Entrada	Exemplos de Saída
5.0                     MEDIA = 6.3
6.0
7.0

5.0                     MEDIA = 9.0
10.0
10.0
 
10.0                    MEDIA = 7.5
10.0
5.0

 

 */
package lista_uri;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class x1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double A , B , C , peso1 , peso2 , peso3 , media;
        
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        peso1 = A*2;
        peso2 = B*3;
        peso3 = C*5;
        media = (peso1 + peso2 + peso3)/10;
        
        System.out.printf("MEDIA = %.1f\n",media);
        
    }
}
