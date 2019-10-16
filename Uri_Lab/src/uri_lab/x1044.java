/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
 */

package uri_lab;
import java.util.Scanner;
public class x1044 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //idenficando variavel 
        int A , B ;
        //entrada de dados
         A = entrada.nextInt();
         B = entrada.nextInt();
        //condiçoes 
        //saida
         
         if ((A % B == 0) | (B % A == 0 )){
             System.out.println("Sao Multiplos");
        }
         else{
             System.out.println("Nao sao Multiplos");
         }
    }
}
