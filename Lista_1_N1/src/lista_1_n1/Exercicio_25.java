/*

 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_25 {
    public static void main(String[] args) {
    Scanner entrada  = new Scanner (System.in);
    int numero ; 
        System.out.println("insira o numero : ");
        numero = entrada.nextInt();
        
        if (numero > 0) {
            System.out.println("e positivo");            
        }
        else{
            System.out.println("e negativo");
        }
        }
    }

