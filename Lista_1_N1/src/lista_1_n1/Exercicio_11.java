/*
Faça um algoritmo que recebe o raio de uma esfera e calcula o seu volume (v = 4/3.P
.R3
), e a área (a = P.R2).
 */

package lista_1_n1;
import java.util.Scanner;
public class Exercicio_11 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double raio , volume ;    
    System.out.println("Apresente o valor do raio :");
    raio = entrada.nextDouble();
    volume = 4/3 * 3.14 * Math.pow(raio, 3);
    System.out.println("O valor do volume e : "+volume);
        
    }
}
