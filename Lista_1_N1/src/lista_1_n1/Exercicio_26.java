/*
Crie um programa para determinar se um número inteiro A é divisível por outro número
B. Os valores devem ser fornecidos pelo usuário.
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_26 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int A , B;
        System.out.println("insira o valor de A ");
        A = entrada.nextInt();
        System.out.println("insira o valor de B ");
        B = entrada.nextInt();
        
        if ((A / B)== 0 ) {
             System.out.println("e divisivel por  B ");  
        }
        else{
            System.out.println("nao e divisivel por B");
        }
        }
    }

