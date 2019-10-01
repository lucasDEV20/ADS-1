/*
Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a
variável A passe a possuir o valor da variável B, e a variável B passe a possuir o valor da
variável A. Apresentar os valores trocados.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_18 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a , b, troca;
        System.out.println("Informe o valor de A : ");
       a = entrada.nextInt();
        System.out.println("Informe o valor de B : ");
       b = entrada.nextInt();
       
       troca = a ;
       a = b;
       b = troca;
       
        System.out.println("o valor de a e : "+ a);
        System.out.println("o valor de b e : "+ b);
        
    }
    
}
